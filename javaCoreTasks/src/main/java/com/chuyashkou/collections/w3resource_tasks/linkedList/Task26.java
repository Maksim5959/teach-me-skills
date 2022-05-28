package com.chuyashkou.collections.w3resource_tasks.linkedList;

//26. Write a Java program to replace an element in a linked list.

import java.util.LinkedList;

public class Task26 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors);
        colors.set(0, "white");
        System.out.println(colors);
    }
}
