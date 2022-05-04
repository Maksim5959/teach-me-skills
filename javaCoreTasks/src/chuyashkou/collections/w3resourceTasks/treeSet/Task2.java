package chuyashkou.collections.w3resourceTasks.treeSet;

//2. Write a Java program to iterate through all elements in a tree set.

import java.util.Iterator;
import java.util.TreeSet;

public class Task2 {

    public static void main(String[] args) {

        TreeSet<String> colors = Task1.createColorsTreeSet();
        Iterator<String> iterator = colors.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String color : colors) {
            System.out.println(color);
        }
        colors.forEach(System.out::println);
    }
}
