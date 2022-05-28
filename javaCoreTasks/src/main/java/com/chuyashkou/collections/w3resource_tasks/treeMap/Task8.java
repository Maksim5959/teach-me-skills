package com.chuyashkou.collections.w3resource_tasks.treeMap;

//8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.

import java.util.TreeMap;

public class Task8 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.firstEntry());
        System.out.println(colors.lastEntry());
    }
}
