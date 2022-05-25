package chuyashkou.collections.w3resourceTasks.linkedList;

//16. Write a Java program to shuffle the elements in a linked list.

import java.util.Collections;
import java.util.LinkedList;

public class Task16 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        Collections.sort(colors);
        System.out.println(colors);
        Collections.shuffle(colors);
        System.out.println(colors);
    }
}
