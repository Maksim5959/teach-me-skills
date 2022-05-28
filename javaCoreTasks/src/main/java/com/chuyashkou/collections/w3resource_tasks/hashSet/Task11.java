package com.chuyashkou.collections.w3resource_tasks.hashSet;

//11. Write a Java program to compare two sets and retain elements which are same on both sets.

import java.util.HashSet;

public class Task11 {

    public static void main(String[] args) {


        HashSet<String> colors1 = Task1.createColorSet();
        HashSet<String> colors2 = Task1.createColorSet();

        System.out.println(colors1);
        System.out.println(colors2);

        colors1.retainAll(colors2);

        System.out.println(colors1);
    }
}
