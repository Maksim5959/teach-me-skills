package com.chuyashkou.collections.w3resource_tasks.arrayList;

//7. Write a Java program to search an element in a array list.

import java.util.List;

public class Task7 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        int i = Math.max(searchColor(colors, "white"), -1);
        if (i > -1) System.out.printf("Index of color %s - %d", colors.get(i), i);
        else System.out.println("Color not found.");
    }

    private static int searchColor(List<String> colors, String color) {
        for (int i = 0; i < colors.size(); i++) {
            if (color.equalsIgnoreCase(colors.get(i))) return i;
        }
        return -1;
    }
}
