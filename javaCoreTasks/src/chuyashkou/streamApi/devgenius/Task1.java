package chuyashkou.streamApi.devgenius;

// 1. Получите список товаров, относящихся к категории «Книги» с ценой > 15.

import chuyashkou.streamApi.devgenius.generator.CustomersGenerator;
import chuyashkou.streamApi.devgenius.model.Customer;
import chuyashkou.streamApi.devgenius.model.Product;
import chuyashkou.streamApi.devgenius.model.ProductCategory;

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
