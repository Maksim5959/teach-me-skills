package com.chuyashkou.collections.w3resource_tasks.priorityQueue;

    //8. Write a Java program to retrieve the first element of the priority queue.

import java.util.PriorityQueue;

public class Task8 {

    public static void main(String[] args) {

        PriorityQueue<String> colors = Task1.createColorQueue();
        System.out.println(colors);
        System.out.println(colors.peek());
    }
}
