package chuyashkou.streamApi.devgenius;

// 6. Получите 3 последних доставленных заказа.

import chuyashkou.streamApi.devgenius.generator.CustomersGenerator;
import chuyashkou.streamApi.devgenius.model.Customer;
import chuyashkou.streamApi.devgenius.model.Order;
import chuyashkou.streamApi.devgenius.model.OrderStatus;

import java.util.Comparator;
import java.util.List;

public class Task6 {

    public static void main(String[] args) {

        List<Customer> customers = CustomersGenerator.getCustomers();

        customers.stream().flatMap(customer -> customer.getOrders().stream()
                .filter(order -> order.getStatus() == OrderStatus.COMPLETED || order.getStatus() == OrderStatus.REFUNDED))
                .sorted(Comparator.comparing(Order::getDeliveryDate).reversed())
                .limit(3)
                .forEach(System.out::println);
    }
}
