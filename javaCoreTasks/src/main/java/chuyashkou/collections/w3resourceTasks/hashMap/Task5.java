package chuyashkou.collections.w3resourceTasks.hashMap;

//5. Write a Java program to check whether a map contains key-value mappings (empty) or not.

import java.util.HashMap;

public class Task5 {

    public static void main(String[] args) {

        HashMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors.isEmpty());
        colors.clear();
        System.out.println(colors.isEmpty());
    }
}
