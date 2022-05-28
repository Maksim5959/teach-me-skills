package com.chuyashkou.collections.w3resource_tasks.linkedList;

//9. Write a Java program to insert some elements at the specified position into a linked list.

import java.util.LinkedList;

public class Task9 {

    public static void main(String[] args) {

        LinkedList<String> colors1 = Task1.createColorList();
        LinkedList<String> colors2 = Task1.createColorList();
        System.out.println(colors1);
        System.out.println(colors2);
        colors1.addAll(2, colors2);
        System.out.println(colors1);
    }
}
