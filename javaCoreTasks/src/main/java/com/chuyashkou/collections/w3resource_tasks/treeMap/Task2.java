package com.chuyashkou.collections.w3resource_tasks.treeMap;

//2. Write a Java program to copy a Tree Map content to another Tree Map.

import java.util.TreeMap;

public class Task2 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors1 = Task1.createColorsMap();
        TreeMap<Integer, String> colors2 = Task1.createColorsMap();
        colors2.putAll(colors1);
        System.out.println(colors2);
    }
}
