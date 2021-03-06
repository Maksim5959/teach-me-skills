package com.chuyashkou.lessons_oop.animal;

public class Horse extends Animal {

    int strengthLevel;

    public Horse() {
    }

    public Horse(String food, String location, int strengthLevel) {
        super(food, location);
        this.strengthLevel = strengthLevel;
    }

    @Override
    public void makeNoise() {
        System.out.println("Игого");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит");
    }
}
