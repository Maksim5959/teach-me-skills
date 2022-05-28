package com.chuyashkou.lesson3;

//6) Даны 2 числа. Вывести большее из них.

public class Task6 {

    public static void main(String[] args) {

        int a = 20;
        int b = 50;
        int result;

        result = a - b > 0 ? a : b;

        System.out.println(result);
    }
}
