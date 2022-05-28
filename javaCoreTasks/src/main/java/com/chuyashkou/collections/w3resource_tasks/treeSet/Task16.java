package com.chuyashkou.collections.w3resource_tasks.treeSet;

//16. Write a Java program to remove a given element from a tree set.

import java.util.TreeSet;

public class Task16 {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = Task1.createNumbersTreeSet();
        numbers.add(7);
        System.out.println(numbers);
        numbers.remove(7);
        System.out.println(numbers);
    }
}
