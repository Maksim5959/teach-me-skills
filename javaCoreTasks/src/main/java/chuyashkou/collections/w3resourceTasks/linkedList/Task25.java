package chuyashkou.collections.w3resourceTasks.linkedList;

//25. Write a Java program to test an linked list is empty or not.

import java.util.LinkedList;

public class Task25 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();
        System.out.println(colors.isEmpty());
        colors.clear();
        System.out.println(colors.isEmpty());
    }
}
