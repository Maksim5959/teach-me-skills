package com.chuyashkou.lessons_oop.car.com.company;

import com.chuyashkou.lessons_oop.car.com.company.details.Engine;
import com.chuyashkou.lessons_oop.car.com.company.professions.Driver;
import com.chuyashkou.lessons_oop.car.com.company.professions.Person;
import com.chuyashkou.lessons_oop.car.com.company.vehicles.Car;
import com.chuyashkou.lessons_oop.car.com.company.vehicles.Lorry;

public class CarApp {

    public static void main(String[] args) {

        Engine engine = new Engine(560, "General Motors");
        Driver person = new Person("Ivanov Ivan Ivanovich", 1, 25);

        Car car = new Lorry("Scania", "Long", 15, engine, person, 20);

        car.printInfo();
        car.stop();
        car.start();
        car.turnLeft();
        car.turnRight();
    }
}
