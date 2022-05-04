package chuyashkou.collections.w3resourceTasks.treeMap;

//1. Write a Java program to associate the specified value with the specified key in a Tree Map.

import java.util.Random;
import java.util.TreeMap;

public class Task1 {

    public static void main(String[] args) {

        TreeMap<Integer, String> colors = createColorsMap();
        System.out.println(colors);
    }

    static TreeMap<Integer, String> createColorsMap() {
        TreeMap<Integer, String> colors = new TreeMap<>();
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
