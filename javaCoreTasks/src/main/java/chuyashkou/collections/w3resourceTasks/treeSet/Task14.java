package chuyashkou.collections.w3resourceTasks.treeSet;

//14. Write a Java program to retrieve and remove the first element of a tree set.

import java.util.TreeSet;

public class Task14 {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = Task1.createNumbersTreeSet();
        System.out.println(numbers);
        System.out.println(numbers.pollFirst());
        System.out.println(numbers);
    }
}
