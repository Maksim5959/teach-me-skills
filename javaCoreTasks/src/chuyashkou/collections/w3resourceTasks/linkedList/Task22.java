package chuyashkou.collections.w3resourceTasks.linkedList;

//22. Write a Java program to check if a particular element exists in a linked list.

import java.util.LinkedList;

public class Task22 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors);
        System.out.println(colors.contains("white"));
    }
}
