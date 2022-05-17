package chuyashkou.streamApi.devgenius;

//2. Получить список заказов с продуктами, относящимися к категории «Игрушки».

import chuyashkou.streamApi.devgenius.generator.CustomersGenerator;
import chuyashkou.streamApi.devgenius.models.Customer;
import chuyashkou.streamApi.devgenius.models.ProductCategory;

import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        customers.stream().flatMap(customer -> customer.getOrders().stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> product.getCategory() == ProductCategory.TOYS)))
                .forEach(System.out::println);
    }
}
