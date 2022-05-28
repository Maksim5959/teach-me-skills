package com.chuyashkou.lessons_oop.clothes;

public class Tie extends Clothes implements MensClothes {

    public Tie() {
    }

    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String dressAMan() {
        return toString();
    }

    @Override
    public String toString() {
        return "Tie - " + super.toString();
    }
}
