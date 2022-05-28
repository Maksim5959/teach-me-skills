package com.chuyashkou.collections.w3resource_tasks.linkedList;

//24. Write a Java program to compare two linked lists.

import java.util.LinkedList;

public class Task24 {

    public static void main(String[] args) {

        LinkedList<String> colors1 = Task1.createColorList();
        LinkedList<String> colors2 = Task1.createColorList();
        LinkedList<Boolean> compares = new LinkedList<>();

        System.out.println(colors1);
        System.out.println(colors2);

        for (String s : colors1) {
            compares.add(colors2.contains(s));
        }

        System.out.println(compares);
    }
}
