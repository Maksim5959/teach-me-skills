package chuyashkou.collections.w3resourceTasks.treeSet;

//12. Write a Java program to get the element in a tree set which is strictly greater to the given element.

import java.util.TreeSet;

public class Task12 {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = Task1.createNumbersTreeSet();
        System.out.println(numbers);
        System.out.println(numbers.higher(7));
    }
}
