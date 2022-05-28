package com.chuyashkou.collections.examclouds_tasks.product;

import java.util.Objects;

public class Product {

    private ProductType type;
    private Double price;

    public Product() {
    }

    public Product(ProductType type, Double price) {
        this.type = type;
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return type == product.type && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }
}
