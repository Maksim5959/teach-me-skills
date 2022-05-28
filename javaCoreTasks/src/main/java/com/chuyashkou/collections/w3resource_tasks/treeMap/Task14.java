package com.chuyashkou.collections.w3resource_tasks.treeMap;

//14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.

import java.util.TreeMap;

public class Task14 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.headMap(3, true));
    }
}
