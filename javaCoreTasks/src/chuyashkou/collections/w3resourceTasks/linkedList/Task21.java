package chuyashkou.collections.w3resourceTasks.linkedList;

//21. Write a Java program to retrieve but does not remove, the last element of a linked list.

import java.util.LinkedList;

public class Task21 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors);
        System.out.println(colors.peekLast());
        System.out.println(colors);
    }
}
