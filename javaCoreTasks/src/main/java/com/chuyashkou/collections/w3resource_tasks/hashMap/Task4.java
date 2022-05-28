package com.chuyashkou.collections.w3resource_tasks.hashMap;

//4. Write a Java program to remove all of the mappings from a map.

import java.util.HashMap;

public class Task4 {

    public static void main(String[] args) {

        HashMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        colors.clear();
        System.out.println(colors);
    }
}
