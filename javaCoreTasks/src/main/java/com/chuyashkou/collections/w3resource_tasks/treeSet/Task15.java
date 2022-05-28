package com.chuyashkou.collections.w3resource_tasks.treeSet;

//15. Write a Java program to retrieve and remove the last element of a tree set.

import java.util.TreeSet;

public class Task15 {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = Task1.createNumbersTreeSet();
        System.out.println(numbers);
        System.out.println(numbers.pollLast());
        System.out.println(numbers);
    }
}
