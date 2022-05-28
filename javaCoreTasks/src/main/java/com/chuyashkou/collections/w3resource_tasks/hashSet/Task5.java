package com.chuyashkou.collections.w3resource_tasks.hashSet;

//5. Write a Java program to test a hash set is empty or not.

import java.util.HashSet;

public class Task5 {

    public static void main(String[] args) {

        HashSet<String> colors = Task1.createColorSet();
        System.out.println(colors.isEmpty());
        colors.clear();
        System.out.println(colors.isEmpty());
    }
}
