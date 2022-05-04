package chuyashkou.collections.w3resourceTasks.priorityQueue;

//3. Write a Java program to add all the elements of a priority queue to another priority queue.

import java.util.PriorityQueue;

public class Task3 {

    public static void main(String[] args) {

        PriorityQueue<String> colors1 = Task1.createColorQueue();
        PriorityQueue<String> colors2 = Task1.createColorQueue();

        System.out.println(colors1);
        System.out.println(colors2);
        System.out.println(colors1.addAll(colors2));
    }
}
