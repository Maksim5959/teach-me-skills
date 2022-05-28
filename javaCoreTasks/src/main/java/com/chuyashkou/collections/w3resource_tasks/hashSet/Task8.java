package com.chuyashkou.collections.w3resource_tasks.hashSet;

//8. Write a Java program to convert a hash set to a tree set.

import java.util.HashSet;
import java.util.TreeSet;

public class Task8 {

    public static void main(String[] args) {

        HashSet<String> colors = Task1.createColorSet();
        TreeSet<String> colorsTreeSet = new TreeSet<>(colors);
        System.out.println(colors);
        System.out.println(colorsTreeSet);
    }
}
