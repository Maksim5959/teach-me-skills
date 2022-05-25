package chuyashkou.streamApi.binkurt;

//9. Найдите минимальное, максимальное и среднее население стран мира.

import chuyashkou.streamApi.binkurt.generator.CountryGenerator;
import chuyashkou.streamApi.binkurt.model.country.Country;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {

    public static void main(String[] args) {

        List<Country> countryList = CountryGenerator.getCountries();

        System.out.println(countryList.stream().collect(Collectors.summarizingDouble(Country::getPopulation)));
    }
}
