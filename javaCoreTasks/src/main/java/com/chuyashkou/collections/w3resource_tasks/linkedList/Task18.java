package com.chuyashkou.collections.w3resource_tasks.linkedList;

//18. Write a Java program to clone an linked list to another linked list.

import java.util.LinkedList;

public class Task18 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        LinkedList<String> clone = (LinkedList<String>) colors.clone();
        System.out.println(colors);
        System.out.println(clone);
    }
}
