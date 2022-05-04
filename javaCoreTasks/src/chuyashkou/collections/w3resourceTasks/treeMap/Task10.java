package chuyashkou.collections.w3resourceTasks.treeMap;

//10. Write a Java program to get a reverse order view of the keys contained in a given map.

import java.util.TreeMap;

public class Task10 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.descendingKeySet());
    }
}
