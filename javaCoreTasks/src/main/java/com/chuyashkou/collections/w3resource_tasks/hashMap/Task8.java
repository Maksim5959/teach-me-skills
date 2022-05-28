package com.chuyashkou.collections.w3resource_tasks.hashMap;

//8. Write a Java program to test if a map contains a mapping for the specified value.

import java.util.HashMap;

public class Task8 {

    public static void main(String[] args) {

        HashMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.containsValue("white"));
        System.out.println(colors);
    }
}
