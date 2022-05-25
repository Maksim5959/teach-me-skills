package chuyashkou.collections.w3resourceTasks.treeSet;

//9. Write a Java program to find the numbers less than 7 in a tree set.

import java.util.TreeSet;

public class Task9 {

    public static void main(String[] args) {

        TreeSet<Integer> numbers1 = Task1.createNumbersTreeSet();
        TreeSet<Integer> numbers2 = (TreeSet<Integer>) numbers1.headSet(7, false);

        System.out.println(numbers1);
        System.out.println(numbers2);
    }
}
