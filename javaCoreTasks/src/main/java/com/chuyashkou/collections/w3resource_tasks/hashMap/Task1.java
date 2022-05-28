package com.chuyashkou.collections.w3resource_tasks.hashMap;

//1. Write a Java program to associate the specified value with the specified key in a HashMap.

import java.util.HashMap;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        HashMap<Integer, String> colors = createColorsMap();
        System.out.println(colors);
        colors.entrySet().forEach(System.out::println);
    }

    static HashMap<Integer, String> createColorsMap() {
        HashMap<Integer, String> colors = new HashMap<>();
        Random random = new Random();
        int choice = random.nextInt(7) + 1;
        for (int i = 0; i < 10; i++) {
            switch (choice) {
                case 1 -> colors.put(choice, "red");
                case 2 -> colors.put(choice, "green");
                case 3 -> colors.put(choice, "blue");
                case 4 -> colors.put(choice, "white");
                case 5 -> colors.put(choice, "black");
                case 6 -> colors.put(choice, "brown");
                case 7 -> colors.put(choice, "purple");
            }
            choice = random.nextInt(7) + 1;
        }
        return colors;
    }
}
