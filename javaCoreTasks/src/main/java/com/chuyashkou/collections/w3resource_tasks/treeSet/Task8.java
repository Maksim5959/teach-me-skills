package com.chuyashkou.collections.w3resource_tasks.treeSet;

//8. Write a Java program to compare two tree sets.

import java.util.TreeSet;

public class Task8 {

    public static void main(String[] args) {

        TreeSet<String> colors1 = Task1.createColorsTreeSet();
        TreeSet<String> colors2 = Task1.createColorsTreeSet();

        System.out.println(colors1);
        System.out.println(colors2);

        for (String s : colors1) {
            System.out.print(colors2.contains(s) ? "true " : "false ");
        }
    }
}
