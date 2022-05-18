package chuyashkou.streamApi.devgenius;

//5. Получите самый дешевый товар категории «Книги».

import chuyashkou.streamApi.devgenius.generator.CustomersGenerator;
import chuyashkou.streamApi.devgenius.model.Customer;
import chuyashkou.streamApi.devgenius.model.Product;
import chuyashkou.streamApi.devgenius.model.ProductCategory;

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
