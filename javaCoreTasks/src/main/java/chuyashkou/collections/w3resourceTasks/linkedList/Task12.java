package chuyashkou.collections.w3resourceTasks.linkedList;

//12. Write a Java program to remove a specified element from a linked list.

import java.util.LinkedList;

public class Task12 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors);
        colors.remove(0);
        System.out.println(colors);
    }
}
