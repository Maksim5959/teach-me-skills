package com.chuyashkou.collections.w3resource_tasks.hashMap;

//7. Write a Java program to test if a map contains a mapping for the specified key.

import java.util.HashMap;

public class Task7 {

    public static void main(String[] args) {

        HashMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.containsKey(1));
        System.out.println(colors);
    }
}
