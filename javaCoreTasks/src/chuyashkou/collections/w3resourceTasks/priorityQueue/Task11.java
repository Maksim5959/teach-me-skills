package chuyashkou.collections.w3resourceTasks.priorityQueue;

//11. Write a Java program to convert a Priority Queue elements to a string representation.

import java.util.PriorityQueue;

public class Task11 {

    public static void main(String[] args) {

        PriorityQueue<String> colors = Task1.createColorQueue();
        String colorsString = colors.toString();
        System.out.println(colorsString);
    }
}
