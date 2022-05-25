package chuyashkou.collections.w3resourceTasks.linkedList;

//2. Write a Java program to iterate through all elements in a linked list.

import java.util.Iterator;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        colors.forEach(System.out::println);
        for (String color : colors) {
            System.out.println(color);
        }
       Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
