package com.chuyashkou.collections.w3resource_tasks.treeMap;

//23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.

import java.util.TreeMap;

public class Task23 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.tailMap(2, true));
    }
}
