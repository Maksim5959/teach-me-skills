package com.chuyashkou.collections.w3resource_tasks.hashSet;

//12. Write a Java program to remove all of the elements from a hash set.

import java.util.HashSet;

public class Task12 {

    public static void main(String[] args) {

        HashSet<String> colors = Task1.createColorSet();
        System.out.println(colors);
        colors.clear();
        colors.removeAll(colors);
        System.out.println(colors);
    }
}
