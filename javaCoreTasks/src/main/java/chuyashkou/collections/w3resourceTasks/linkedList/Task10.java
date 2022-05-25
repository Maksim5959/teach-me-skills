package chuyashkou.collections.w3resourceTasks.linkedList;

//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.

import java.util.LinkedList;

public class Task10 {

    public static void main(String[] args) {

        LinkedList<String> colors = Task1.createColorList();

        colors.add(0, "white");
        colors.add(1, "white");
        colors.add(12, "black");
        colors.add(13, "black");

        System.out.println(colors);
        System.out.println(colors.indexOf("white"));
        System.out.println(colors.lastIndexOf("white"));
        System.out.println(colors.indexOf("black"));
        System.out.println(colors.lastIndexOf("black"));
    }
}
