package chuyashkou.collections.w3resourceTasks.treeSet;

//13. Write a Java program to get an element in a tree set which is strictly less than the given element.

import java.util.TreeSet;

public class Task13 {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = Task1.createNumbersTreeSet();
        System.out.println(numbers);
        System.out.println(numbers.lower(7));
    }
}
