package com.chuyashkou.collections.w3resource_tasks.treeMap;

//9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.

import java.util.TreeMap;

public class Task9 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.firstKey());
        System.out.println(colors.lastKey());
    }
}
