package com.chuyashkou.collections.w3resource_tasks.treeMap;

//3. Write a Java program to search a key in a Tree Map.

import java.util.TreeMap;

public class Task3 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.containsKey(1));
    }
}
