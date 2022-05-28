package com.chuyashkou.collections.w3resource_tasks.priorityQueue;

//9. Write a Java program to retrieve and remove the first element.

import java.util.PriorityQueue;

public class Task9 {

    public static void main(String[] args) {

        PriorityQueue<String> colors = Task1.createColorQueue();
        System.out.println(colors);
        System.out.println(colors.poll());
        System.out.println(colors);
    }
}
