package com.jsp.springbootnativequery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootnativequery.dao.CountryDao;
import com.jsp.springbootnativequery.dto.Country;

@Service
public class CountryService {

	@Autowired
	CountryDao countryDao;

	public Country saveMyCountry(Country country) {

		countryDao.saveMyCountry(country);

		return country;

	}

	public List<Country> displayAllCountry() {
		return countryDao.displayAllCountry();
	}

	// deleteMethod
	public String deleteCountry(int id) {

		countryDao.deleteCountry(id);

		return "Data Deleted";
	}

	// updateMethod
	public String updateCountry(String countryName, String countryCapital, int countryCode) {
		countryDao.updateCountry(countryName, countryCapital, countryCode);
		return "Data Updated";
	}
}
