package com.chuyashkou.collections.w3resource_tasks.treeMap;

//21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).

import java.util.TreeMap;

public class Task21 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.subMap(1, true, 7, false));
    }
}
