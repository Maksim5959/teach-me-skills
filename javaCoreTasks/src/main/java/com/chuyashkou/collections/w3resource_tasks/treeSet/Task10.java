package com.chuyashkou.collections.w3resource_tasks.treeSet;

//10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.

import java.util.TreeSet;

public class Task10 {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = Task1.createNumbersTreeSet();
        System.out.println(numbers);
        System.out.println(numbers.ceiling(7));
    }
}
