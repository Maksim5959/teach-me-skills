package chuyashkou.collections.w3resourceTasks.priorityQueue;

//4. Write a Java program to insert a given element into a priority queue.

import java.util.PriorityQueue;

public class Task4 {

    public static void main(String[] args) {

        PriorityQueue<String> colors = Task1.createColorQueue();
        System.out.println(colors);
        System.out.println(colors.offer("white"));
        System.out.println(colors);
    }
}
