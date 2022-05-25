package chuyashkou.collections.w3resourceTasks.treeSet;

//1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.

import java.util.Random;
import java.util.TreeSet;

public class Task1 {

    public static void main(String[] args) {

        TreeSet<String> colors = createColorsTreeSet();
        System.out.println(colors);
    }

    static TreeSet<String> createColorsTreeSet() {
        TreeSet<String> colors = new TreeSet<>();
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

    static TreeSet<Integer> createNumbersTreeSet () {
        TreeSet<Integer> numbers = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(21));
        }
        return numbers;
    }
}
