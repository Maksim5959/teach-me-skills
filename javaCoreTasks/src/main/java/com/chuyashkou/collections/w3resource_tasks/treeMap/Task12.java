package com.chuyashkou.collections.w3resource_tasks.treeMap;

//12. Write a Java program to get the greatest key less than or equal to the given key.

import java.util.TreeMap;

public class Task12 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.floorKey(3));
    }
}
