package com.chuyashkou.collections.w3resource_tasks.arrayList;

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        List<String> colors = createColorList();
        System.out.println(colors);
    }

    static ArrayList<String> createColorList() {
        ArrayList<String> colors = new ArrayList<>();
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
