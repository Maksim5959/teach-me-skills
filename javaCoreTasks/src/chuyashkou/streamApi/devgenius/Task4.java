package chuyashkou.streamApi.devgenius;

//4. Получите список продуктов, заказанных клиентом уровня 2 в период с 01 мая 2022г. по 05 мая 2022 г.

import chuyashkou.streamApi.devgenius.generator.CustomersGenerator;
import chuyashkou.streamApi.devgenius.model.Customer;
import chuyashkou.streamApi.devgenius.model.Product;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        customers.stream().filter(customer -> customer.getLevel() == 2)
                .flatMap(customer -> customer.getOrders().stream()
                        .filter(order -> order.getOrderDate().isAfter(LocalDate.of(2022, 4, 30))
                                && order.getOrderDate().isBefore(LocalDate.of(2022, 5, 6)))
                        .flatMap(order -> order.getProducts().stream()))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .forEach(System.out::println);
    }
}