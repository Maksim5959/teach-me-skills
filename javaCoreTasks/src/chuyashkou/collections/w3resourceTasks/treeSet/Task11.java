package chuyashkou.collections.w3resourceTasks.treeSet;

//11. Write a Java program to get the element in a tree set which is less than or equal to the given element.

import java.util.TreeSet;

public class Task11 {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = Task1.createNumbersTreeSet();
        System.out.println(numbers);
        System.out.println(numbers.floor(7));
    }
}
