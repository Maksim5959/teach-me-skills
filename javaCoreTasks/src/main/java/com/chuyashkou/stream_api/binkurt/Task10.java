package com.chuyashkou.stream_api.binkurt;

//10. Найдите минимальное, максимальное и среднее население каждого континента.

import com.chuyashkou.stream_api.binkurt.generator.CountryGenerator;
import com.chuyashkou.stream_api.binkurt.model.country.Country;

import java.util.List;
import java.util.stream.Collectors;

public class Task10 {

    public static void main(String[] args) {

        List<Country> countryList = CountryGenerator.getCountries();

        countryList.stream().collect(Collectors
                .groupingBy(Country::getContinent, Collectors.summarizingDouble(Country::getPopulation))).entrySet()
                .forEach(System.out::println);
    }
}
