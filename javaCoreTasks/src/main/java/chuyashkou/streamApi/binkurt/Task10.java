package chuyashkou.streamApi.binkurt;

//10. Найдите минимальное, максимальное и среднее население каждого континента.

import chuyashkou.streamApi.binkurt.generator.CountryGenerator;
import chuyashkou.streamApi.binkurt.model.country.Country;

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
