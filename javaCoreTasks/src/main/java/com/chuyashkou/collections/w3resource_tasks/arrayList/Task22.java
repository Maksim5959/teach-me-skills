package com.chuyashkou.collections.w3resource_tasks.arrayList;

//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.

import java.util.List;

public class Task22 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
