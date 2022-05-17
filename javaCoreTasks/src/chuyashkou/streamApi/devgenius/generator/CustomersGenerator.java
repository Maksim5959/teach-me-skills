package chuyashkou.streamApi.devgenius.generator;

import chuyashkou.streamApi.devgenius.models.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class CustomersGenerator {

    public static List<Customer> getCustomers() {
        Customer customer1 = new Customer("Ivan", 2, Arrays.asList(
                new Order(OrderStatus.CANCELLED, LocalDate.of(2022, 5, 5), LocalDate.of(2022, 5, 13),
                        Arrays.asList(new Product("Teddy", ProductCategory.TOYS, 15.00),
                                new Product("War and peace", ProductCategory.BOOKS, 20.00))),
                new Order(OrderStatus.COMPLETED, LocalDate.of(2022, 5, 1), LocalDate.of(2022, 5, 3),
                        Arrays.asList(new Product("Robot", ProductCategory.TOYS, 18.00),
                                new Product("Harry Potter", ProductCategory.BOOKS, 25.00)))));

        Customer customer2 = new Customer("Irina", 4, Arrays.asList(
                new Order(OrderStatus.REFUNDED, LocalDate.of(2022, 5, 5), LocalDate.of(2022, 5, 6),
                        Arrays.asList(new Product("coat", ProductCategory.CLOTHES, 66.00),
                                new Product("jeans", ProductCategory.CLOTHES, 45.00),
                                new Product("sneakers", ProductCategory.CLOTHES, 90.00))),
                new Order(OrderStatus.COMPLETED, LocalDate.of(2022, 5, 1), LocalDate.of(2022, 5, 3),
                        Arrays.asList(new Product("Car", ProductCategory.TOYS, 50.00),
                                new Product("Lego", ProductCategory.TOYS, 55.00))),
                new Order(OrderStatus.COMPLETED, LocalDate.of(2022, 5, 6), LocalDate.of(2022, 5, 8),
                        Arrays.asList(new Product("dresser", ProductCategory.FURNITURE, 100.00),
                                new Product("bed", ProductCategory.FURNITURE, 255.00)))));

        Customer customer3 = new Customer("Oleg", 4, Arrays.asList(
                new Order(OrderStatus.REFUNDED, LocalDate.of(2022, 5, 2), LocalDate.of(2022, 5, 3),
                        Arrays.asList(new Product("snake", ProductCategory.TOYS, 50.00),
                                new Product("tetris", ProductCategory.TOYS, 55.00))),
                new Order(OrderStatus.COMPLETED, LocalDate.of(2022, 5, 6), LocalDate.of(2022, 5, 8),
                        Arrays.asList(new Product("Jane Air", ProductCategory.BOOKS, 19.00),
                                new Product("The great Gatsby", ProductCategory.BOOKS, 25.00)))));

        Customer customer4 = new Customer("Ivan", 5, Collections.singletonList(
                new Order(OrderStatus.COMPLETED, LocalDate.of(2022, 5, 14), LocalDate.of(2022, 5, 20),
                        Arrays.asList(new Product("Ironman", ProductCategory.TOYS, 26.00),
                                new Product("coat", ProductCategory.CLOTHES, 55.00),
                                new Product("Moby Dick", ProductCategory.BOOKS, 15.00)))));
        return Arrays.asList(customer1, customer2, customer3, customer4);
    }
}
