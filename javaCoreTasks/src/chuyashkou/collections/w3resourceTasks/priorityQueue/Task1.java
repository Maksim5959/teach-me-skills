package chuyashkou.collections.w3resourceTasks.priorityQueue;

//1. Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.

import java.util.PriorityQueue;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        PriorityQueue<String> colors = createColorQueue();
        System.out.println(colors);
    }

    static PriorityQueue<String> createColorQueue() {
        PriorityQueue<String> colors = new PriorityQueue<>();
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

    static PriorityQueue<Integer> createNumbersPriorityQueue() {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(21));
        }
        return numbers;
    }

}
