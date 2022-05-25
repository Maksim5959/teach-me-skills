package chuyashkou.collections.w3resourceTasks.linkedList;

//15. Write a Java program of swap two elements in a linked list.

import java.util.Collections;
import java.util.LinkedList;

public class Task15 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors);
        Collections.swap(colors, 0, 9);
        System.out.println(colors);
    }
}
