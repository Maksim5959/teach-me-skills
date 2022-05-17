package chuyashkou.streamApi.devgenius;

//8. Рассчитайте общую сумму всех выполненных заказов, сделанных в мае 2022 г.

import chuyashkou.streamApi.devgenius.generator.CustomersGenerator;
import chuyashkou.streamApi.devgenius.models.Customer;
import chuyashkou.streamApi.devgenius.models.OrderStatus;
import chuyashkou.streamApi.devgenius.models.Product;

import java.time.Month;
import java.util.List;

public class Task8 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        System.out.println(customers.stream().flatMap(customer -> customer.getOrders().stream()
                .filter(order -> order.getStatus() == OrderStatus.COMPLETED
                        && order.getOrderDate().getMonth().equals(Month.MAY)
                        && order.getOrderDate().getYear() == 2022)
                .flatMap(order -> order.getProducts().stream()))
                .mapToDouble(Product::getPrice)
                .sum());
    }
}
