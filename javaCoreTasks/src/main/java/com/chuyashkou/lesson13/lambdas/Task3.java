package com.chuyashkou.lesson13.lambdas;

/*3. Проверка строки.
Написать программу, которая проверяет, что строка начинается буквой “J”или “N”
и заканчивается “A”. Используем функциональный интерфейс Predicate.*/

import java.util.function.Predicate;

public class Task3 {

    public static void main(String[] args) {

        String[] strings = {"null", "James is from Alabama","Namibia"};

        Predicate<String> isStartWithJ = s -> s.charAt(0) == 'J' || s.charAt(0) == 'j';
        Predicate<String> isStartWithN = s -> s.charAt(0) == 'N' || s.charAt(0) == 'n';
        Predicate<String> isEndWithA = s -> s.charAt(s.length() - 1) == 'A' || s.charAt(s.length() - 1) == 'a';

        for (String s : strings) {
            System.out.println(isStartWithJ.or(isStartWithN).and(isEndWithA).test(s));
        }
    }
}
