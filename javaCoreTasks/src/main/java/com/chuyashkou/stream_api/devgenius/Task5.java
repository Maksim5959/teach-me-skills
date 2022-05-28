package com.chuyashkou.stream_api.devgenius;

//5. Получите самый дешевый товар категории «Книги».

import com.chuyashkou.stream_api.devgenius.generator.CustomersGenerator;
import com.chuyashkou.stream_api.devgenius.model.Customer;
import com.chuyashkou.stream_api.devgenius.model.Product;
import com.chuyashkou.stream_api.devgenius.model.ProductCategory;

import java.util.Comparator;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        System.out.println(customers.stream().flatMap(customer -> customer.getOrders().stream()
                .flatMap(order -> order.getProducts().stream()
                        .filter(product -> product.getCategory() == ProductCategory.BOOKS)))
                .min(Comparator.comparingDouble(Product::getPrice)).orElse(new Product()));
    }
}
