package chuyashkou.collections.w3resourceTasks.hashMap;

//10. Write a Java program to get the value of a specified key in a map.

import java.util.HashMap;

public class Task10 {

    public static void main(String[] args) {

        HashMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        System.out.println(colors.get(1));
    }
}
