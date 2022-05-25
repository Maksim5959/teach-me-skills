package chuyashkou.streamApi.binkurt;

//3. Отсортируйте страны по количеству городов в порядке убывания:

import chuyashkou.streamApi.binkurt.generator.CountryGenerator;
import chuyashkou.streamApi.binkurt.model.country.Country;

import java.util.Comparator;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        List<Country> countryList = CountryGenerator.getCountries();

        countryList.stream().sorted(Comparator.comparing(Country::getCities, Comparator.comparing(List::size))
                .thenComparing(Country::getCode).reversed())
                .forEach(country -> System.out.printf("%s - %d\n", country.getName(), country.getCities().size()));
    }
}
