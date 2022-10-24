package com.nation.demo.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "country_id")
	private long countryId;

	@ManyToMany
	@JoinTable(name = "country_languages", joinColumns = @JoinColumn(name = "country_id"), inverseJoinColumns = @JoinColumn(name = "language_id"))
	Set<Language> languages;

	@OneToMany(mappedBy = "id.country")
	Set<CountryStats> countryStats;

	@Column(name = "name")
	private String name;

	@Column(name = "area")
	private long area;

	@Column(name = "national_day")
	private Date nationalDay;

	@Column(name = "country_code2")
	private String countryCode2;

	@Column(name = "country_code3")
	private String countryCode3;

	@Column(name = "region_id")
	private int regionId;

	public long getCountryId() {
		return countryId;
	}

	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getArea() {
		return area;
	}

	public void setArea(long area) {
		this.area = area;
	}

	public Date getNationalDay() {
		return nationalDay;
	}

	public void setNationalDay(Date nationalDay) {
		this.nationalDay = nationalDay;
	}

	public String getCountryCode2() {
		return countryCode2;
	}

	public void setCountryCode2(String countryCode2) {
		this.countryCode2 = countryCode2;
	}

	public String getCountryCode3() {
		return countryCode3;
	}

	public void setCountryCode3(String countryCode3) {
		this.countryCode3 = countryCode3;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public Set<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(Set<Language> languages) {
		this.languages = languages;
	}

	public Set<CountryStats> getCountryStats() {
		return countryStats;
	}

	public void setCountryStats(Set<CountryStats> countryStats) {
		this.countryStats = countryStats;
	}

}
