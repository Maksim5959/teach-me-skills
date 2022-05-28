package com.chuyashkou.lesson10.task1;

import java.util.Random;

public class Car {

    private String brand;
    private int speed;
    private double price;

    public Car() {
    }

    public Car(String brand, int speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() throws CarException {
        Random random = new Random();
        if (random.nextInt(21) % 2 == 0) {
            throw new CarException(toString() + " didn't start." , new ArithmeticException(), true, false);
        } else {
            System.out.println(this.toString() + " started.");
        }
    }

    @Override
    public String toString() {
        return "The car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
