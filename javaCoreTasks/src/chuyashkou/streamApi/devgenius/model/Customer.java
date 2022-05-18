package chuyashkou.streamApi.devgenius.model;

import java.util.List;
import java.util.Objects;

public class Customer {

    private String name;
    private int level;
    private List<Order> orders;

    public Customer() {
    }

    public Customer(String name, int level, List<Order> orders) {
        this.name = name;
        this.level = level;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return level == customer.level && Objects.equals(name, customer.name) && Objects.equals(orders, customer.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, orders);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", orders=" + orders +
                '}';
    }
}
