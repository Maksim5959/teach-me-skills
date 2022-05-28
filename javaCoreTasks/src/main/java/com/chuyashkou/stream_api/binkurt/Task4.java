package com.chuyashkou.stream_api.binkurt;

// 4. Отсортируйте страны по плотности населения в порядке убывания, игнорируя страны с нулевым населением:

import com.chuyashkou.stream_api.binkurt.generator.CountryGenerator;
import com.chuyashkou.stream_api.binkurt.model.country.Country;

import java.util.Comparator;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<Country> countryList = CountryGenerator.getCountries();

        countryList.stream().sorted(Comparator.comparingDouble(Country::getPopulation).reversed())
                .filter(country -> country.getPopulation() > 0)
                .forEach(country -> System.out.printf("%s - %.3f\n", country.getName(), country.getPopulation()));
    }
}
