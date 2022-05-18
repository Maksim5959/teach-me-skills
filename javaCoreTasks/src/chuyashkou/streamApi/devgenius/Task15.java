package chuyashkou.streamApi.devgenius;

//15. Найдите самый дорогой продукт по категории

import chuyashkou.streamApi.devgenius.generator.CustomersGenerator;
import chuyashkou.streamApi.devgenius.model.Customer;
import chuyashkou.streamApi.devgenius.model.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task15 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        customers.stream().flatMap(customer -> customer.getOrders().stream().flatMap(order -> order.getProducts().stream()))
                .collect(Collectors
                        .groupingBy(Product::getCategory, Collectors
                                .maxBy(Comparator.comparingDouble(Product::getPrice)))).entrySet()
                .forEach(System.out::println);
    }
}
