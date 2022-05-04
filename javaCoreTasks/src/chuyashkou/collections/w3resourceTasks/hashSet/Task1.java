package chuyashkou.collections.w3resourceTasks.hashSet;

//1. Write a Java program to append the specified element to the end of a hash set.

import java.util.HashSet;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        HashSet<String> colors = createColorSet();
        colors.add("white");
        System.out.println(colors);
    }

    static HashSet<String> createColorSet() {
        HashSet<String> colors = new HashSet<>();
        Random random = new Random();
        int choice = random.nextInt(7) + 1;
        for (int i = 0; i < 10; i++) {
            switch (choice) {
                case 1 -> colors.add("red");
                case 2 -> colors.add("green");
                case 3 -> colors.add("blue");
                case 4 -> colors.add("white");
                case 5 -> colors.add("black");
                case 6 -> colors.add("brown");
                case 7 -> colors.add("purple");
            }
            choice = random.nextInt(7) + 1;
        }
        return colors;
    }
}