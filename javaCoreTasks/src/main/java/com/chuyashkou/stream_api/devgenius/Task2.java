package com.chuyashkou.stream_api.devgenius;

//2. Получить список заказов с продуктами, относящимися к категории «Игрушки».

import com.chuyashkou.stream_api.devgenius.generator.CustomersGenerator;
import com.chuyashkou.stream_api.devgenius.model.Customer;
import com.chuyashkou.stream_api.devgenius.model.ProductCategory;

import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        customers.stream().flatMap(customer -> customer.getOrders().stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> product.getCategory() == ProductCategory.TOYS)))
                .forEach(System.out::println);
    }
}
