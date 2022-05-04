package chuyashkou.collections.w3resourceTasks.treeMap;

//17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.

import java.util.TreeMap;

public class Task17 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.lowerKey(1));
    }
}
