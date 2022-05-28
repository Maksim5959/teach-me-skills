package com.chuyashkou.collections.w3resource_tasks.hashMap;

//12. Write a Java program to get a collection view of the values contained in this map.

import java.util.HashMap;

public class Task12 {

    public static void main(String[] args) {

        HashMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.values());
    }
}
