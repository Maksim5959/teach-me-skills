package chuyashkou.streamApi.binkurt;

//2. Найдите самый густонаселенный город на каждом континенте:

import chuyashkou.streamApi.binkurt.generator.CountryGenerator;
import chuyashkou.streamApi.binkurt.model.country.City;
import chuyashkou.streamApi.binkurt.model.country.Country;

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
