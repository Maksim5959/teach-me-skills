package com.chuyashkou.stream_api.devgenius;

//11. Получите Map  с заказом в качестве ключа и количеством продуктов в заказе в качестве значения.

import com.chuyashkou.stream_api.devgenius.generator.CustomersGenerator;
import com.chuyashkou.stream_api.devgenius.model.Customer;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task11 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        customers.stream().flatMap(customer -> customer.getOrders().stream())
                .collect(Collectors.toMap(Function.identity(), c -> c.getProducts().size())).entrySet()
                .forEach(System.out::println);
    }
}
