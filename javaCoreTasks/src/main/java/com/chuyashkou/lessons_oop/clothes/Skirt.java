package com.chuyashkou.lessons_oop.clothes;

public class Skirt extends Clothes implements WomenClothes {

    public Skirt() {
    }

    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String dressAWoman() {
        return toString();
    }

    @Override
    public String toString() {
        return "Skirt - " + super.toString();
    }
}
