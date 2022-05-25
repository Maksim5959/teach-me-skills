package chuyashkou.lessonsOOP.car.com.company.vehicles;

import chuyashkou.lessonsOOP.car.com.company.details.Engine;
import chuyashkou.lessonsOOP.car.com.company.professions.Driver;

public class Lorry extends Car {

    int capacity;

    public Lorry() {
    }

    public Lorry(String brand, String carClass, int weight, Engine engine, Driver driver, int capacity) {
        super(brand, carClass, weight, engine, driver);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
