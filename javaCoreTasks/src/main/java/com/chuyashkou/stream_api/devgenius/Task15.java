package com.chuyashkou.stream_api.devgenius;

//15. Найдите самый дорогой продукт по категории

import com.chuyashkou.stream_api.devgenius.generator.CustomersGenerator;
import com.chuyashkou.stream_api.devgenius.model.Customer;
import com.chuyashkou.stream_api.devgenius.model.Product;

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
