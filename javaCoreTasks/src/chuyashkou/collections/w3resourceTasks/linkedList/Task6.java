package chuyashkou.collections.w3resourceTasks.linkedList;

//6. Write a Java program to insert elements into the linked list at the first and last position.

import java.util.LinkedList;

public class Task6 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors);
        colors.addFirst("white");
        colors.addLast("white");
        System.out.println(colors);
    }
}
