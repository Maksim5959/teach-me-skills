package com.chuyashkou.lessons_oop.clothes;

public class TShirt extends Clothes implements MensClothes, WomenClothes {

    public TShirt() {
    }

    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String dressAMan() {
        return toString();
    }

    @Override
    public String dressAWoman() {
        return toString();
    }

    @Override
    public String toString() {
        return "TShirt - " + super.toString();
    }
}
