package com.chuyashkou.stream_api.devgenius;

//12. Создайте Map с записями заказов, сгруппированными по статусу.

import com.chuyashkou.stream_api.devgenius.generator.CustomersGenerator;
import com.chuyashkou.stream_api.devgenius.model.Customer;
import com.chuyashkou.stream_api.devgenius.model.Order;

import java.util.List;
import java.util.stream.Collectors;

public class Task12 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        customers.stream().flatMap(customer -> customer.getOrders().stream())
                .collect(Collectors.groupingBy(Order::getStatus)).entrySet()
                .forEach(System.out::println);
    }
}
