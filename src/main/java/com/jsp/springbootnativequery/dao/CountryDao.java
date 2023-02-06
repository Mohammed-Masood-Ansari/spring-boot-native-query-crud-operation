package com.jsp.springbootnativequery.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootnativequery.dto.Country;
import com.jsp.springbootnativequery.repository.CountryRepository;

@Repository
public class CountryDao {
	
	@Autowired
	CountryRepository countryRepository;
	
	public void saveMyCountry(Country country) {
		
		 countryRepository.saveMyCountry(country);
		
	}
	
	public List<Country> displayAllCountry(){
		return countryRepository.displayAllCountry();
	}
	
	//deleteMethod
	public void deleteCountry(int id) {
		countryRepository.deleteCountry(id);
	}
	
	//updateMethod
	public void updateCountry(String countryName,String countryCapital,int countryCode) {
		countryRepository.updateCountry(countryName, countryCapital, countryCode);
	}
}
