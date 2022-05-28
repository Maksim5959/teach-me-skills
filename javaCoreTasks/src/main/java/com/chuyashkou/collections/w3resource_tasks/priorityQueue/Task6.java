package com.chuyashkou.collections.w3resource_tasks.priorityQueue;

//6. Write a Java program to count the number of elements in a priority queue.

import java.util.PriorityQueue;

public class Task6 {

    public static void main(String[] args) {

        PriorityQueue<String> colors = Task1.createColorQueue();
        System.out.println(colors);
        System.out.println(colors.size());
    }
}
