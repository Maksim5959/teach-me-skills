package chuyashkou.lessonsOOP.car.com.company.vehicles;

import chuyashkou.lessonsOOP.car.com.company.details.Engine;
import chuyashkou.lessonsOOP.car.com.company.professions.Driver;

public class SportCar extends Car {

    int maxSpeed;

    public SportCar() {
    }

    public SportCar(String brand, String carClass, int weight, Engine engine, Driver driver, int maxSpeed) {
        super(brand, carClass, weight, engine, driver);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
