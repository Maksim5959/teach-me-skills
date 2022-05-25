package chuyashkou.collections.w3resourceTasks.hashMap;

//2. Write a Java program to count the number of key-value (size) mappings in a map.

import java.util.HashMap;

public class Task2 {

    public static void main(String[] args) {

        HashMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.size());
    }
}
