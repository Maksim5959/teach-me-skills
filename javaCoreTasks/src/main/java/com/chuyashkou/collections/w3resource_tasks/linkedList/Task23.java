package com.chuyashkou.collections.w3resource_tasks.linkedList;

//23. Write a Java program to convert a linked list to array list.

import java.util.ArrayList;
import java.util.LinkedList;

public class Task23 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        ArrayList<String> arrayList = new ArrayList<>(colors);
        System.out.println(colors);
        System.out.println(arrayList);
    }
}
