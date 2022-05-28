package com.chuyashkou.collections.w3resource_tasks.linkedList;

//8. Write a Java program to insert the specified element at the end of a linked list.

import java.util.LinkedList;

public class Task8 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors);
        System.out.println(colors.offerLast("white"));
        System.out.println(colors);
    }
}
