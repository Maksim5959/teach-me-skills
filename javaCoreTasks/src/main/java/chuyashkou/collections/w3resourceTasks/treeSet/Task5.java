package chuyashkou.collections.w3resourceTasks.treeSet;

//5. Write a Java program to get the first and last elements in a tree set.

import java.util.TreeSet;

public class Task5 {

    public static void main(String[] args) {

        TreeSet<String> colors = Task1.createColorsTreeSet();
        System.out.println(colors);
        System.out.println(colors.first());
        System.out.println(colors.last());
    }
}
