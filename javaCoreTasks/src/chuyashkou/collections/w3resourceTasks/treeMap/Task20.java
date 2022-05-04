package chuyashkou.collections.w3resourceTasks.treeMap;

//20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.

import java.util.TreeMap;

public class Task20 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.pollLastEntry());
        System.out.println(colors);
    }
}
