package com.chuyashkou.stream_api.binkurt;

//1. Найдите самый густонаселенный город в каждой стране.

import com.chuyashkou.stream_api.binkurt.model.country.City;
import com.chuyashkou.stream_api.binkurt.model.country.Country;
import com.chuyashkou.stream_api.binkurt.generator.CountryGenerator;

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
