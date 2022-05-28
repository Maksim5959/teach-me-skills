package com.chuyashkou.collections.w3resource_tasks.hashMap;

//3. Write a Java program to copy all of the mappings from the specified map to another map.

import java.util.HashMap;

public class Task3 {

    public static void main(String[] args) {

        HashMap<Integer, String> colors1 = Task1.createColorsMap();
        HashMap<Integer, String> colors2 = new HashMap<>();
        colors2.putAll(colors1);
        System.out.println(colors2);
        System.out.println(colors1);
    }
}
