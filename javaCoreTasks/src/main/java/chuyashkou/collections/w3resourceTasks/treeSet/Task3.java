package chuyashkou.collections.w3resourceTasks.treeSet;

//3. Write a Java program to add all the elements of a specified tree set to another tree set.

import java.util.TreeSet;

public class Task3 {

    public static void main(String[] args) {

        TreeSet<String> colors1 = Task1.createColorsTreeSet();
        TreeSet<String> colors2 = Task1.createColorsTreeSet();

        System.out.println(colors1);
        System.out.println(colors2);

        colors1.addAll(colors2);

        System.out.println(colors1);
    }
}
