package chuyashkou.collections.w3resourceTasks.treeMap;

//11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.

import java.util.TreeMap;

public class Task11 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.floorEntry(3));
    }
}
