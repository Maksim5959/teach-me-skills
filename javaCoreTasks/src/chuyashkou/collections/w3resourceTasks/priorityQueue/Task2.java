package chuyashkou.collections.w3resourceTasks.priorityQueue;

//2. Write a Java program to iterate through all elements in priority queue.

import java.util.Iterator;
import java.util.PriorityQueue;

public class Task2 {

    public static void main(String[] args) {

        PriorityQueue<String> colors = Task1.createColorQueue();

        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String color : colors) {
            System.out.println(color);
        }
        colors.forEach(System.out::println);
    }
}
