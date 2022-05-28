package com.chuyashkou.collections.w3resource_tasks.linkedList;

//17. Write a Java program to join two linked lists.

import java.util.LinkedList;

public class Task17 {

    public static void main(String[] args) {

        LinkedList<String> colors1 = Task1.createColorList();
        LinkedList<String> colors2 = Task1.createColorList();
        System.out.println(colors1);
        colors1.addAll(colors2);
        System.out.println(colors1);
    }
}
