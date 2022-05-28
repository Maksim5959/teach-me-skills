package com.chuyashkou.stream_api.binkurt.model.country;

import java.util.List;
import java.util.Objects;

public class Country {

    private String code;
    private String name;
    private String continent;
    private double surfaceArea;
    private double population;
    private Capital capital;
    private List<City> cities;

    public Country() {
    }

    public Country(String code, String name, String continent, double surfaceArea, double population, Capital capital, List<City> cities) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.surfaceArea = surfaceArea;
        this.population = population;
        this.capital = capital;
        this.cities = cities;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Double.compare(country.surfaceArea, surfaceArea) == 0 && Double.compare(country.population, population) == 0 && Objects.equals(code, country.code) && Objects.equals(name, country.name) && Objects.equals(continent, country.continent) && capital == country.capital && Objects.equals(cities, country.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, continent, surfaceArea, population, capital, cities);
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", population=" + population +
                ", capital=" + capital +
                ", cities=" + cities +
                '}';
    }
}
