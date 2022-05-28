package com.chuyashkou.collections.examclouds_tasks;

/*4. Методы union() и intersect()
Напишите методы union(Set<?>... set) и intersect(Set<?> ... set), реализующих операции объединения и пересечения множеств.
Протестируйте работу этих методов на предварительно заполненных множествах.*/

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {

    public static void main(String[] args) {

        Set<Integer> values1 = createSet();
        Set<Integer> values2 = createSet();
        Set<Integer> values3 = createSet();

        System.out.printf("First set: %s\n", values1);
        System.out.printf("Second set: %s\n", values2);
        System.out.printf("Third set: %s\n", values3);

        System.out.printf("Union: %s ", union(values1, values2, values3));
        System.out.printf("Intersect: %s ", intersect(values1, values2, values3));
    }

    private static Set<Integer> createSet() {
        Set<Integer> values = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            values.add(random.nextInt(10));
        }
        return values;
    }

    private static <T> Set<T> union(Set<T>... sets) {
        Set<T> unions = new HashSet<>();
        for (Set<T> set : sets) {
            unions.addAll(set);
        }
        return unions;
    }

    private static <T> Set<T> intersect(Set<T>... sets) {
        Set<T> intersects = new HashSet<>();
        for (Set<T> set : sets) {
            intersects = set;
            break;
        }

        for (Set<T> set : sets) {
            intersects.retainAll(set);
        }
        return intersects;
    }
}
