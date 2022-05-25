package chuyashkou.collections.w3resourceTasks.linkedList;

//7. Write a Java program to insert the specified element at the front of a linked list.

import java.util.LinkedList;

public class Task7 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors);
        System.out.println(colors.offerFirst("white"));
        System.out.println(colors);
    }
}
