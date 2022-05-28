package com.chuyashkou.stream_api.devgenius;

//3. Получите список продуктов с категорией = «Одежда», а затем примените скидку 10%.

import com.chuyashkou.stream_api.devgenius.generator.CustomersGenerator;
import com.chuyashkou.stream_api.devgenius.model.Customer;
import com.chuyashkou.stream_api.devgenius.model.Product;
import com.chuyashkou.stream_api.devgenius.model.ProductCategory;

import java.util.Comparator;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        customers.stream().flatMap(customer -> customer.getOrders().stream()
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.getCategory() == ProductCategory.CLOTHES))
                .peek(product -> product.setPrice(product.getPrice() * 0.9))
                .sorted(Comparator.comparing(Product::getPrice).thenComparing(Product::getName))
                .forEach(System.out::println);
    }
}
