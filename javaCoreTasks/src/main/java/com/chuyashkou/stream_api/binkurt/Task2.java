package com.chuyashkou.stream_api.binkurt;

//2. Найдите самый густонаселенный город на каждом континенте:

import com.chuyashkou.stream_api.binkurt.generator.CountryGenerator;
import com.chuyashkou.stream_api.binkurt.model.country.City;
import com.chuyashkou.stream_api.binkurt.model.country.Country;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {

        List<Country> countryList = CountryGenerator.getCountries();

        countryList.stream().collect(Collectors.toMap(Country::getContinent,
                country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation))
                        .orElseThrow(), (c1, c2) -> {
                    if (c1.getPopulation() > c2.getPopulation()) return c1;
                    else return c2;
                })).entrySet().forEach(System.out::println);
    }
}
