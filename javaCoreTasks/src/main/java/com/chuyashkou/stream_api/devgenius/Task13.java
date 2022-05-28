package com.chuyashkou.stream_api.devgenius;

//13. Создайте Map с записью заказа и общей суммой продукта.

import com.chuyashkou.stream_api.devgenius.generator.CustomersGenerator;
import com.chuyashkou.stream_api.devgenius.model.Customer;
import com.chuyashkou.stream_api.devgenius.model.Product;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task13 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        customers.stream().flatMap(customer -> customer.getOrders().stream())
                .collect(Collectors.toMap(Function.identity(), order -> order.getProducts().stream()
                        .mapToDouble(Product::getPrice)
                        .sum())).entrySet()
                .forEach(System.out::println);
    }
}
