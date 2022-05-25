package chuyashkou.collections.w3resourceTasks.treeMap;

//13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.

import java.util.TreeMap;

public class Task13 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.headMap(5));
    }
}
