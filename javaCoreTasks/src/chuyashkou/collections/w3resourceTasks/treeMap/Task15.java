package chuyashkou.collections.w3resourceTasks.treeMap;

//15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.

import java.util.TreeMap;

public class Task15 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.higherEntry(7));
    }
}
