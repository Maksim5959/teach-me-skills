package chuyashkou.collections.w3resourceTasks.treeMap;

//4. Write a Java program to search a value in a Tree Map.

import java.util.TreeMap;

public class Task4 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.containsValue("white"));
    }
}
