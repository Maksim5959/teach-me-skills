package com.chuyashkou.lesson_string;

/*4. Найти два средних знака строки
Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака.
Например, если дана строка "string"  результат будет "ri", для строки "code" результат "od",
для "Practice" результат "ct".*/

public class Task4 {

    public static void main(String[] args) {

        String s = "Practice";
        System.out.println(s.charAt((s.length() / 2) - 1) + "" + s.charAt((s.length() / 2)));
    }
}
