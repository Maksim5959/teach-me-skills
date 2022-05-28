package com.chuyashkou.collections.w3resource_tasks.arrayList;

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        System.out.println(colors.get(1));
    }
}
