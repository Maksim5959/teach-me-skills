package com.chuyashkou.lessons_oop.person;

public class PersonApp {

    public static void main(String[] args) {

        Person ivan = new Person();
        Person aleksey = new Person("Aleksey", 15);

        ivan.move();
        aleksey.talk();
    }
}
