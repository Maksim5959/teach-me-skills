package com.chuyashkou.stream_api.devgenius;

//14. Получите Map со списком названий продуктов по категориям.

import com.chuyashkou.stream_api.devgenius.generator.CustomersGenerator;
import com.chuyashkou.stream_api.devgenius.model.Customer;
import com.chuyashkou.stream_api.devgenius.model.Product;

import java.util.List;
import java.util.stream.Collectors;

public class Task14 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        customers.stream().flatMap(customer -> customer.getOrders().stream()
                .flatMap(order -> order.getProducts().stream()))
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.mapping(Product::getName, Collectors.toList()))).entrySet()
                .forEach(System.out::println);
    }
}
