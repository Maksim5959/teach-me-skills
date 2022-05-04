package chuyashkou.collections.w3resourceTasks.hashSet;

//2. Write a Java program to iterate through all elements in a hash list.

import java.util.HashSet;
import java.util.Iterator;

public class Task2 {

    public static void main(String[] args) {

        HashSet<String> colors = Task1.createColorSet();
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
