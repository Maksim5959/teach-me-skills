package chuyashkou.streamApi.binkurt.model.country;

import java.util.Objects;

public class City {

    private String name;
    private int population;
    private String countryCode;

    public City() {
    }

    public City(String name, int population, String countryCode) {
        this.name = name;
        this.population = population;
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return population == city.population && Objects.equals(name, city.name) && Objects.equals(countryCode, city.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population, countryCode);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
