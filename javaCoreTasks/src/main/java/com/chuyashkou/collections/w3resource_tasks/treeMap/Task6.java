package com.chuyashkou.collections.w3resource_tasks.treeMap;

//6. Write a Java program to delete all elements from a given Tree Map.

import java.util.TreeMap;

public class Task6 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        colors.clear();
        System.out.println(colors);
    }
}
