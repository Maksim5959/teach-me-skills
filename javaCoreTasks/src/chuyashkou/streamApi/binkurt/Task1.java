package chuyashkou.streamApi.binkurt;

//1. Найдите самый густонаселенный город в каждой стране.

import chuyashkou.streamApi.binkurt.model.country.City;
import chuyashkou.streamApi.binkurt.model.country.Country;
import chuyashkou.streamApi.binkurt.generator.CountryGenerator;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        List<Country> countryList = CountryGenerator.getCountries();

        countryList.stream().collect(Collectors.toMap(Country::getName, country -> country.getCities().stream()
                .max(Comparator.comparing(City::getPopulation)).orElse(new City()))).entrySet()
                .forEach(System.out::println);
    }
}
