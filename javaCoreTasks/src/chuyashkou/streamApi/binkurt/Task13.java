package chuyashkou.streamApi.binkurt;

//13. Сгруппируйте страны по континентам, а затем отсортируйте страны на континентах по количеству городов на каждом континенте.

import chuyashkou.streamApi.binkurt.generator.CountryGenerator;
import chuyashkou.streamApi.binkurt.model.country.Country;

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
