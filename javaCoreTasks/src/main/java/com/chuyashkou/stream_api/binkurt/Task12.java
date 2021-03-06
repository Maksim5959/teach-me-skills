package com.chuyashkou.stream_api.binkurt;

//12. Найдите страны каждого континента с минимальной и максимальной численностью населения.

import com.chuyashkou.stream_api.binkurt.generator.CountryGenerator;
import com.chuyashkou.stream_api.binkurt.model.country.City;
import com.chuyashkou.stream_api.binkurt.model.country.Country;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task12 {

    public static void main(String[] args) {

        List<Country> countryList = CountryGenerator.getCountries();

        countryList.stream().collect(Collectors.groupingBy(Country::getContinent, Collectors
                .flatMapping(country -> country.getCities().stream(), Collectors
                        .maxBy(Comparator.comparingDouble(City::getPopulation))))).entrySet()
                .forEach(System.out::println);

        countryList.stream().collect(Collectors.groupingBy(Country::getContinent, Collectors
                .flatMapping(country -> country.getCities().stream(), Collectors
                        .minBy(Comparator.comparingDouble(City::getPopulation))))).entrySet()
                .forEach(System.out::println);
    }
}
