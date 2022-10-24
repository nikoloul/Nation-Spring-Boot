package com.nation.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.nation.demo.model.Country;

interface ProjectIdAndName {
	String getId();

	String getName();
}

public interface CountryRepository extends JpaRepository<Country, Long> {

	@Query("SELECT distinct country.name,country.countryCode3, countryStats.id.year, countryStats.population, MAX (countryStats.gdp) FROM Country country JOIN CountryStats countryStats ON country.countryId = countryStats.id.country GROUP BY country")
	Optional<List<Object>> findMaxGdpCountries();
}
