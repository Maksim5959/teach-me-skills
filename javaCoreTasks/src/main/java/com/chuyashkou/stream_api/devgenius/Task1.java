package com.chuyashkou.stream_api.devgenius;

// 1. Получите список товаров, относящихся к категории «Книги» с ценой > 15.

import com.chuyashkou.stream_api.devgenius.generator.CustomersGenerator;
import com.chuyashkou.stream_api.devgenius.model.Customer;
import com.chuyashkou.stream_api.devgenius.model.Product;
import com.chuyashkou.stream_api.devgenius.model.ProductCategory;

import java.util.Comparator;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        customers.stream().flatMap(customer -> customer.getOrders().stream()
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.getPrice() > 15 && product.getCategory() == ProductCategory.BOOKS))
                .sorted(Comparator.comparing(Product::getPrice).thenComparing(Product::getName))
                .forEach(System.out::println);
    }
}
