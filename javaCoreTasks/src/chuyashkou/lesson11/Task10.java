package chuyashkou.lesson11;

import java.io.File;
import java.io.Serial;
import java.io.Serializable;

/*Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
сериализации произвести обратный процесс.*/

public class Task10 {

    public static void main(String[] args) {

        Car lada = new Car(150, "Lada", 500.00);
        ClassSerialize.serialize(new File("files/serializeFile.ser"), lada);
        System.out.println(ClassSerialize.deserialize(new File("files/serializeFile.ser")));

        Car car = (Car) ClassSerialize.deserialize(new File("files/serializeFile.ser"));
        if (car != null)
            System.out.printf("Car brand: %s, car max speed: %s, car cost: %.2f.", car.getBrand(), car.getMaxSpeed(), car.getCost());
    }
}

class Car implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private int maxSpeed;
    private String brand;
    private double cost;

    public Car() {
    }

    public Car(int maxSpeed, String brand, double cost) {
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.cost = cost;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", brand='" + brand + '\'' +
                ", cost=" + cost +
                '}';
    }
}
