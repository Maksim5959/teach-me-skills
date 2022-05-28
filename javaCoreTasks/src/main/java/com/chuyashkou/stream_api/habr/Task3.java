package com.chuyashkou.stream_api.habr;

/*Метод distinct возвращает stream без дубликатов, при этом для упорядоченного стрима (например, коллекция на основе list)
порядок стабилен, для неупорядоченного — порядок не гарантируется. Рассмотрим результаты работы над коллекцией
Collection ordered = Arrays.asList(«a1», «a2», «a2», «a3», «a1», «a2», «a2») и Collection nonOrdered = new HashSet<>(ordered).
Получение коллекции без дубликатов из неупорядоченного стрима - [a1, a2, a3] — порядок не гарантируется.
Получение коллекции без дубликатов из упорядоченного стрима - [a1, a2, a3] — порядок гарантируется.*/


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("a1", "a2", "a2", "a3", "a1", "a2", "a2");
        Set<String> stringSet = new HashSet<>(stringList);

        System.out.println(stringList.stream().distinct().collect(Collectors.toList()));
        System.out.println(stringSet.stream().distinct().collect(Collectors.toList()));
    }
}
