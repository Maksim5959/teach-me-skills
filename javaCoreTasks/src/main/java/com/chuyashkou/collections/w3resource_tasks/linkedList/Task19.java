package com.chuyashkou.collections.w3resource_tasks.linkedList;

//19. Write a Java program to remove and return the first element of a linked list.

import java.util.LinkedList;

public class Task19 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors);
        System.out.println(colors.pop());
        System.out.println(colors);
        System.out.println(colors.poll());
        System.out.println(colors);
        System.out.println(colors.pollFirst());
        System.out.println(colors);
        System.out.println(colors.removeFirst());
        System.out.println(colors);
    }
}
