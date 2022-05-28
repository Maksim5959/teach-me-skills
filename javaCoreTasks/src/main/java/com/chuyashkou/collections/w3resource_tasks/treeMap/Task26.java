package com.chuyashkou.collections.w3resource_tasks.treeMap;

//26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.

import java.util.TreeMap;

public class Task26 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.ceilingKey(7));
    }
}
