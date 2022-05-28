package com.chuyashkou.collections.w3resource_tasks.treeMap;

//19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.

import java.util.TreeMap;

public class Task19 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.pollFirstEntry());
        System.out.println(colors);
    }
}
