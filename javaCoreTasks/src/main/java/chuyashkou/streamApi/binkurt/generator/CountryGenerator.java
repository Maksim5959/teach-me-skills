package chuyashkou.streamApi.binkurt.generator;

import chuyashkou.streamApi.binkurt.model.country.Capital;
import chuyashkou.streamApi.binkurt.model.country.City;
import chuyashkou.streamApi.binkurt.model.country.Country;

import java.util.Arrays;
import java.util.List;

public final class CountryGenerator {

    public static List<Country> getCountries() {
        Country country1 = new Country("UK", "Great Britain", "Europe", 243.610, 67.22, Capital.LONDON,
                Arrays.asList(new City("Aberdeen", 222793, "UK"),
                        new City("Bangor", 18808, "UK")));
        Country country2 = new Country("RU", "Russia", "Europe", 17100.000, 144.1, Capital.MOSCOW,
                Arrays.asList(new City("Saint Petersburg", 5384342, "RU"),
                        new City("Novosibirsk", 1620162, "RU"),
                        new City("Yekaterinburg", 1495666, "RU")));
        Country country3 = new Country("DE", "Germany", "Europe", 255.615, 68.23, Capital.BERLIN,
                Arrays.asList(new City("Dresden", 155000, "DE"),
                        new City("Munchen", 222000, "DE"),
                        new City("Osnobruck", 25000, "DE"),
                        new City("Koln", 300000, "DE"),
                        new City("Hamburg", 500000, "DE")));
        Country country4 = new Country("USA", "USA", "North America", 8000.000, 329.0, Capital.WASHINGTON,
                Arrays.asList(new City("Los Angeles", 4085000, "USA"),
                        new City("Chicago", 2670406, "USA"),
                        new City("Houston", 2378145, "USA"),
                        new City("New York", 2500550, "USA"),
                        new City("Dallas", 1500000, "USA"),
                        new City("Detroit", 1455255, "USA")));
        Country country5 = new Country("BLR", "Belarus", "Europe", 206.600, 10.0, Capital.MINSK,
                Arrays.asList(new City("Gomel", 500000, "BLR"),
                        new City("Vitebsk", 200000, "BLR"),
                        new City("Brest", 300000, "BLR"),
                        new City("Mogilev", 350000, "BLR")));
        Country country6 = new Country("CND", "Canada", "North America", 10000.600, 150.0, Capital.TORONTO,
                Arrays.asList(new City("Airdrie", 61000, "CND"),
                        new City("Camrose", 80000, "CND"),
                        new City("Lacombe", 850000, "CND"),
                        new City("Edmonton", 950000, "CND")));
        return Arrays.asList(country1, country2, country3, country4, country5,country6);
    }
}
