package com.chuyashkou.collections.w3resource_tasks.arrayList;

//10. Write a Java program to shuffle elements in a array list.

import java.util.Collections;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();

        Collections.sort(colors);
        System.out.println(colors);

        Collections.shuffle(colors);
        System.out.println(colors);
    }
}
