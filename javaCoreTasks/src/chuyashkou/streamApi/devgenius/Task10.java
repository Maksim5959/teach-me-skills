package chuyashkou.streamApi.devgenius;

//10. Получите набор статистических данных по цене
// (т. е. сумма, среднее, максимальное, минимальное, количество) для всех продуктов категории «Книги».

import chuyashkou.streamApi.devgenius.generator.CustomersGenerator;
import chuyashkou.streamApi.devgenius.models.Customer;
import chuyashkou.streamApi.devgenius.models.Product;
import chuyashkou.streamApi.devgenius.models.ProductCategory;

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
