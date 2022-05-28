package com.chuyashkou.collections.w3resource_tasks.treeMap;

//25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key.
// Return null if there is no such key.

import java.util.TreeMap;

public class Task25 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.ceilingEntry(2));
    }
}
