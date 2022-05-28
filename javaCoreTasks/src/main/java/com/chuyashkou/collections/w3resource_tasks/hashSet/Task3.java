package com.chuyashkou.collections.w3resource_tasks.hashSet;

//3. Write a Java program to get the number of elements in a hash set.

import java.util.HashSet;

public class Task3 {

    public static void main(String[] args) {

        HashSet<String> colors = Task1.createColorSet();
        System.out.println(colors);
        System.out.println(colors.size());
    }
}
