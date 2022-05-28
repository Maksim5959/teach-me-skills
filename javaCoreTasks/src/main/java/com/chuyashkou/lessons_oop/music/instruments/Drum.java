package com.chuyashkou.lessons_oop.music.instruments;

public class Drum implements Instrument {

    private int size;

    public Drum() {
    }

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан размером " + this.size + " сантиметров кубических.");
    }
}
