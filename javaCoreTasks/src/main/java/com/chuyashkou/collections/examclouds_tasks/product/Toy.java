package com.chuyashkou.collections.examclouds_tasks.product;

import java.util.Objects;

public class Toy extends Product{

    private String name;

    public Toy() {
    }

    public Toy(ProductType type, Double price, String name) {
        super(type, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Toy toy = (Toy) o;
        return Objects.equals(name, toy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return super.toString() + "Toy{" +
                "name='" + name + '\'' +
                '}';
    }
}
