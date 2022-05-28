package com.chuyashkou.collections.w3resource_tasks.linkedList;

//13. Write a Java program to remove first and last element from a linked list.

import java.util.LinkedList;

public class Task13 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors);
        System.out.println(colors.removeFirst());
        System.out.println(colors.removeLast());
        System.out.println(colors);
    }
}
