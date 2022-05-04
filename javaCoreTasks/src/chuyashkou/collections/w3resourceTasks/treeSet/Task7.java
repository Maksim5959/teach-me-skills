package chuyashkou.collections.w3resourceTasks.treeSet;

//7. Write a Java program to get the number of elements in a tree set.

import java.util.TreeSet;

public class Task7 {

    public static void main(String[] args) {

        TreeSet<String> colors = Task1.createColorsTreeSet();
        System.out.println(colors);
        System.out.println(colors.size());
    }
}
