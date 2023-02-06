package com.jsp.springbootnativequery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootnativequery.dto.Country;
import com.jsp.springbootnativequery.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	CountryService countryService;

	@PostMapping("/countrySave")
	public Country saveMyCountry(@RequestBody Country country) {

		return countryService.saveMyCountry(country);
	}

	@GetMapping("/getAllCountry")
	public List<Country> displayAllCountry() {
		return countryService.displayAllCountry();
	}

	@DeleteMapping("/deleteCountry/{id}")
	// deleteMethod
	public String deleteCountry(@PathVariable int id) {

		return countryService.deleteCountry(id);
	}

	@PutMapping("/updateCountry/{countryName}/{countryCapital}/{countryCode}")
	// updateMethod
	public String updateCountry(@PathVariable String  countryName,@PathVariable String countryCapital,@PathVariable int countryCode) {
		return countryService.updateCountry(countryName, countryCapital, countryCode);
	}

}
