package com.chuyashkou.lesson3;

/* 3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
10. Вывести полученное число.*/

public class Task3 {

    public static void main(String[] args) {

        int value = 0;

        if (value > 0) {
            ++value;
        } else if (value < 0) {
            value -= 2;
        } else {
            value = 10;
        }

        System.out.println(value);
    }
}
