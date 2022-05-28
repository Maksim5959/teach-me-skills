package com.chuyashkou.lessons_oop.car.com.company.vehicles;

import com.chuyashkou.lessons_oop.car.com.company.details.Engine;
import com.chuyashkou.lessons_oop.car.com.company.professions.Driver;

public class Car {

    private String brand;
    private String carClass;
    private int weight;
    private Engine engine;
    private Driver driver;
    private boolean isStarted;

    public Car() {
    }

    public Car(String brand, String carClass, int weight, Engine engine, Driver driver) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void start() {
        System.out.println("Поехали!");
        this.isStarted = true;
    }

    public void stop() {
        if (isStarted) {
            System.out.println("Останавливаемся!");
            this.isStarted = false;
        } else {
            System.out.println("Двигатель заглушен.");
        }
    }

    public void turnLeft() {
        if (isStarted) {
            System.out.println("Поворот на лево!");
        } else {
            System.out.println("Двигатель заглушен.");
        }
    }

    public void turnRight() {
        if (isStarted) {
            System.out.println("Поворот на право!");
        } else {
            System.out.println("Двигатель заглушен.");
        }
    }

    public void printInfo() {
        System.out.println("Car{" +
                "brand='" + brand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", engine=" + engine +
                ", driver=" + driver +
                '}');
    }
}
