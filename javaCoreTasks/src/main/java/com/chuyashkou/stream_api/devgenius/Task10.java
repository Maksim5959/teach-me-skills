package com.chuyashkou.stream_api.devgenius;

//10. Получите набор статистических данных по цене
// (т. е. сумма, среднее, максимальное, минимальное, количество) для всех продуктов категории «Книги».

import com.chuyashkou.stream_api.devgenius.generator.CustomersGenerator;
import com.chuyashkou.stream_api.devgenius.model.Customer;
import com.chuyashkou.stream_api.devgenius.model.Product;
import com.chuyashkou.stream_api.devgenius.model.ProductCategory;

import java.util.List;
import java.util.stream.Collectors;

public class Task10 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        System.out.println(customers.stream().flatMap(customer -> customer.getOrders().stream()
                .flatMap(order -> order.getProducts().stream()
                        .filter(product -> product.getCategory() == ProductCategory.BOOKS)))
                .collect(Collectors.summarizingDouble(Product::getPrice)));
    }
}
