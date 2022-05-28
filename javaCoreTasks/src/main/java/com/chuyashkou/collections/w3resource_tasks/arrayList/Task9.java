package com.chuyashkou.collections.w3resource_tasks.arrayList;

//9. Write a Java program to copy one array list into another.

import java.util.Collections;
import java.util.List;

public class Task9 {

    public static void main(String[] args) {

        List<String> colors1 = Task1.createColorList();
        List<String> colors2 = Task1.createColorList();
        System.out.printf("%s %s\n", colors1, colors2);
        Collections.copy(colors1, colors2);
        System.out.printf("%s %s\n", colors1, colors2);
    }
}
