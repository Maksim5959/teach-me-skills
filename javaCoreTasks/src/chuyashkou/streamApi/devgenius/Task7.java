package chuyashkou.streamApi.devgenius;

// 7. Получите список заказов, сделанных 6 мая 2022 г., выведите в консоль, а затем верните список продуктов.

import chuyashkou.streamApi.devgenius.generator.CustomersGenerator;
import chuyashkou.streamApi.devgenius.models.Customer;
import chuyashkou.streamApi.devgenius.models.Product;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        customers.stream().flatMap(customer -> customer.getOrders().stream()
                .filter(order -> order.getOrderDate().isEqual(LocalDate.of(2022, 5, 6)))
                .peek(System.out::println)
                .flatMap(order -> order.getProducts().stream()))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
