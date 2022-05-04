package chuyashkou.collections.w3resourceTasks.linkedList;

//1. Write a Java program to append the specified element to the end of a linked list.

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        List<String> colors = createColorList();
        System.out.println(colors);
        colors.add("white");
        System.out.println(colors);
    }

    static LinkedList<String> createColorList() {
        LinkedList<String> colors = new LinkedList<>();
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
