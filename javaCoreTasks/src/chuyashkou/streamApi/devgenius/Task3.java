package chuyashkou.streamApi.devgenius;

//3. Получите список продуктов с категорией = «Одежда», а затем примените скидку 10%.

import chuyashkou.streamApi.devgenius.generator.CustomersGenerator;
import chuyashkou.streamApi.devgenius.models.Customer;
import chuyashkou.streamApi.devgenius.models.Product;
import chuyashkou.streamApi.devgenius.models.ProductCategory;

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
