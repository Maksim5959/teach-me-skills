package chuyashkou.collections.w3resourceTasks.treeSet;

//6. Write a Java program to clone a tree set list to another tree set.

import java.util.TreeSet;

public class Task6 {

    public static void main(String[] args) {

        TreeSet<String> colors = Task1.createColorsTreeSet();
        TreeSet<String> clone = (TreeSet<String>) colors.clone();
        System.out.println(clone);
        System.out.println(colors);
    }
}
