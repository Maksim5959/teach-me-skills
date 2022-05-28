package com.chuyashkou.lesson13.lambdas.task1;

/*1. Лямбда выражение для интерфейса Printable
 Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().*/

public class Runner {

    public static void main(String[] args) {

        Printable printable = () -> System.out.println("This is implementation of method print.");
        printable.print();
    }
}
