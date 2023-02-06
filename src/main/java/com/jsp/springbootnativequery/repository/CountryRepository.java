package com.jsp.springbootnativequery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.springbootnativequery.dto.Country;

import jakarta.transaction.Transactional;

public interface CountryRepository extends JpaRepository<Country, Integer> {

	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value = "insert into country(countryCode,countryCapital,countryName,countryStates)"
			+ "values(:#{#country.countryCode},:#{#country.countryCapital},:#{#country.countryName},:#{#country.countryStates})",nativeQuery = true)
	public void saveMyCountry(@Param("country") Country country);
	
	@Query(value = "Select * from country",nativeQuery = true)
	public List<Country> displayAllCountry();
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value = "delete from country where countrycode=?1",nativeQuery = true)
	public void deleteCountry(int id);
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value = "update country set countryname=?1, countrycapital=?2 where countrycode=?3",nativeQuery = true)
	public void updateCountry(String countryName,String countryCapital,int countryCode);
}
