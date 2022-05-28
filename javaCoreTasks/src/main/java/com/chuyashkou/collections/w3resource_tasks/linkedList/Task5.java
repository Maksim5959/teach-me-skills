package com.chuyashkou.collections.w3resource_tasks.linkedList;

//5. Write a Java program to insert the specified element at the specified position in the linked list.

import java.util.LinkedList;

public class Task5 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors);
        colors.add(2, "white");
        System.out.println(colors);
    }
}
