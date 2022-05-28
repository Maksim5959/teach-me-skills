package com.chuyashkou.collections.w3resource_tasks.linkedList;

//4. Write a Java program to iterate a linked list in reverse order.

import java.util.Iterator;
import java.util.LinkedList;

public class Task4 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors);
        Iterator<String> iterator = colors.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
