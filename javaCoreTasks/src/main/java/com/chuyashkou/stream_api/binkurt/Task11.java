package com.chuyashkou.stream_api.binkurt;

//11. Найдите страны с минимальным и максимальным населением.

import com.chuyashkou.stream_api.binkurt.generator.CountryGenerator;
import com.chuyashkou.stream_api.binkurt.model.country.Country;

import java.util.Comparator;
import java.util.List;

public class Task11 {

    public static void main(String[] args) {

        List<Country> countryList = CountryGenerator.getCountries();

        System.out.println(countryList.stream().max(Comparator.comparingDouble(Country::getPopulation)).orElse(new Country()));
        System.out.println(countryList.stream().min(Comparator.comparingDouble(Country::getPopulation)).orElse(new Country()));
    }
}
