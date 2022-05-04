package chuyashkou.collections.w3resourceTasks.treeMap;

//5. Write a Java program to get all keys from the given a Tree Map.

import java.util.TreeMap;

public class Task5 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.keySet());
    }
}
