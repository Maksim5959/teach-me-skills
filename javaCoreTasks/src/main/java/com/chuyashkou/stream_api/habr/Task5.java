package com.chuyashkou.stream_api.habr;

/*Примеры использования Map функций (map, mapToInt, FlatMap, FlatMapToInt)
Условие: даны две коллекции collection1 = Arrays.asList(«a1», «a2», «a3», «a1») и
collection2 = Arrays.asList(«1,2,0», «4,5»), давайте посмотрим как её можно обрабатывать используя различные map функции:
Добавить "_1" к каждому элементу первой коллекции - [a1_1, a2_1, a3_1, a1_1]
В первой коллекции убрать первый символ и вернуть массив чисел (int[]) - [1, 2, 3, 1]
Из второй коллекции получить все числа, перечисленные через запятую из всех элементов	 - [1, 2, 0, 4, 5]
Из второй коллекции получить сумму всех чисел, перечисленных через запятую - 12*/

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Task5 {

    public static void main(String[] args) {

        Collection<String> collection1 = Arrays.asList("a1", "a2", "a3", "a1");
        Collection<String> collection2 = Arrays.asList("1,2,0", "4,5");

        System.out.println(collection1.stream()
                .map(s -> s + "_1")
                .collect(Collectors.toList()));

        System.out.println(Arrays.toString(collection1.stream()
                .mapToInt(s -> Integer.parseInt(s.substring(1)))
                .toArray()));

        System.out.println(Arrays.toString(collection2.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .toArray(String[]::new)));

        System.out.println(collection2.stream()
                .flatMapToInt(s -> Arrays.stream(s.split(","))
                        .mapToInt(Integer::parseInt)).sum());
    }
}
