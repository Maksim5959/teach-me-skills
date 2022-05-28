package com.chuyashkou.collections.w3resource_tasks.hashMap;

//11. Write a Java program to get a set view of the keys contained in this map.

import java.util.HashMap;

public class Task11 {

    public static void main(String[] args) {

        HashMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.keySet());
    }
}
