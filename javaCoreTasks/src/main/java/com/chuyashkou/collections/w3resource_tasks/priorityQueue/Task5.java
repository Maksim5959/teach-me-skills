package com.chuyashkou.collections.w3resource_tasks.priorityQueue;

//5. Write a Java program to remove all the elements from a priority queue.

import java.util.PriorityQueue;

public class Task5 {

    public static void main(String[] args) {

        PriorityQueue<String> colors = Task1.createColorQueue();
        System.out.println(colors);
        colors.clear();
        System.out.println(colors.removeAll(colors));
        System.out.println(colors);
    }
}
