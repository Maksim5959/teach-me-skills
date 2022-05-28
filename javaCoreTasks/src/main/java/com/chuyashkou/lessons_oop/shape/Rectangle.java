package com.chuyashkou.lessons_oop.shape;

public class Rectangle extends Shape {

    private int a;
    private int b;

    public Rectangle() {
    }

    public Rectangle(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: " + a + " " + b + " " + this.getColor());
    }
}
