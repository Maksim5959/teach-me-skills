package com.chuyashkou.stream_api.devgenius;

// 6. Получите 3 последних доставленных заказа.

import com.chuyashkou.stream_api.devgenius.generator.CustomersGenerator;
import com.chuyashkou.stream_api.devgenius.model.Customer;
import com.chuyashkou.stream_api.devgenius.model.Order;
import com.chuyashkou.stream_api.devgenius.model.OrderStatus;

import java.util.Comparator;
import java.util.List;

public class Task6 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        customers.stream().flatMap(customer -> customer.getOrders().stream()
                .filter(order -> order.getStatus() == OrderStatus.COMPLETED || order.getStatus() == OrderStatus.REFUNDED))
                .sorted(Comparator.comparing(Order::getDeliveryDate).reversed())
                .limit(3)
                .forEach(System.out::println);
    }
}
