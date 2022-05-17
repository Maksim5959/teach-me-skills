package chuyashkou.streamApi.devgenius;

//12. Создайте Map с записями заказов, сгруппированными по статусу.

import chuyashkou.streamApi.devgenius.generator.CustomersGenerator;
import chuyashkou.streamApi.devgenius.models.Customer;
import chuyashkou.streamApi.devgenius.models.Order;

import java.util.List;
import java.util.stream.Collectors;

public class Task12 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        customers.stream().flatMap(customer -> customer.getOrders().stream())
                .collect(Collectors.groupingBy(Order::getStatus)).entrySet()
                .forEach(System.out::println);
    }
}
