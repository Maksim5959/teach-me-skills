package com.chuyashkou.collections.w3resource_tasks.treeSet;

//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.

import java.util.Iterator;
import java.util.TreeSet;

public class Task4 {

    public static void main(String[] args) {

        TreeSet<String> colors = Task1.createColorsTreeSet();
        System.out.println(colors);

        Iterator iterator = colors.descendingIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
