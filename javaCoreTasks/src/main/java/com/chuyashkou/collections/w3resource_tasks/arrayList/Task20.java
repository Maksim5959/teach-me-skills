package com.chuyashkou.collections.w3resource_tasks.arrayList;

//20. Write a Java program to increase the size of an array list.

import java.util.ArrayList;

public class Task20 {

    public static void main(String[] args) {

        ArrayList<String> colors = Task1.createColorList();
        System.out.println(colors);
        colors.ensureCapacity(20);
        colors.addAll(Task1.createColorList());
        System.out.println(colors);
    }
}
