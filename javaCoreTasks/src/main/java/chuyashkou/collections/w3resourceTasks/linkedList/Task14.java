package chuyashkou.collections.w3resourceTasks.linkedList;

//14. Write a Java program to remove all the elements from a linked list.

import java.util.LinkedList;

public class Task14 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors);
        colors.clear();
        System.out.println(colors);
    }
}
