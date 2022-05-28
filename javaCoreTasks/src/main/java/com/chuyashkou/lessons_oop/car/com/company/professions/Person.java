package com.chuyashkou.lessons_oop.car.com.company.professions;

public class Person extends Driver {

    int age;

    public Person() {
    }

    public Person(String fullName, int drivingExperience, int age) {
        super(fullName, drivingExperience);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
