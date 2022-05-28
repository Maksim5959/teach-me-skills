package com.chuyashkou.collections.w3resource_tasks.treeMap;

//18. Write a Java program to get NavigableSet view of the keys contained in a map.

import java.util.TreeMap;

public class Task18 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.navigableKeySet());
    }
}
