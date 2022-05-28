package com.chuyashkou.lessons_oop.music.instruments;

public class Horn implements Instrument {

    private int diameter;

    public Horn() {
    }

    public Horn(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + this.diameter + " дюймов.");
    }
}
