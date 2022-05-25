package chuyashkou.collections.w3resourceTasks.linkedList;

//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.

import java.util.Iterator;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        System.out.println(colors);
        Iterator<String> iterator = colors.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
