package com.chuyashkou.stream_api.devgenius;

// 9. Расчитать средний платеж по заказам, сделанным 14 мая 2022 г.

import com.chuyashkou.stream_api.devgenius.generator.CustomersGenerator;
import com.chuyashkou.stream_api.devgenius.model.Customer;
import com.chuyashkou.stream_api.devgenius.model.Product;

import java.time.LocalDate;
import java.util.List;

public class Task9 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        System.out.println(customers.stream().flatMap(customer -> customer.getOrders().stream()
                .filter(order -> order.getOrderDate().isEqual(LocalDate.of(2022, 5, 14)))
                .flatMap(order -> order.getProducts().stream()))
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0));
    }
}
