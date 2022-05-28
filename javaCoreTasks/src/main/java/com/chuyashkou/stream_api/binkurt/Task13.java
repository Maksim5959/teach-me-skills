package com.chuyashkou.stream_api.binkurt;

//13. Сгруппируйте страны по континентам, а затем отсортируйте страны на континентах по количеству городов на каждом континенте.

import com.chuyashkou.stream_api.binkurt.generator.CountryGenerator;
import com.chuyashkou.stream_api.binkurt.model.country.Country;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task13 {

    public static void main(String[] args) {

        List<Country> countryList = CountryGenerator.getCountries();

        Comparator<Country> countryComparator = Comparator.comparing(country -> country.getCities().size());

        countryList.stream().sorted(countryComparator.reversed())
                .collect(Collectors.groupingBy(Country::getContinent)).entrySet()
                .forEach(System.out::println);
    }
}
