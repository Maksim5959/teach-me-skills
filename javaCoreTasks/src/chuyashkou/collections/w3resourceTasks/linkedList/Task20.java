package chuyashkou.collections.w3resourceTasks.linkedList;

//20. Write a Java program to retrieve but does not remove, the first element of a linked list.

import java.util.LinkedList;

public class Task20 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors);
        System.out.println(colors.peekFirst());
        System.out.println(colors);
    }
}
