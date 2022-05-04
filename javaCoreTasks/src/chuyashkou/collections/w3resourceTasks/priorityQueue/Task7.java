package chuyashkou.collections.w3resourceTasks.priorityQueue;

//7. Write a Java program to compare two priority queues.

import java.util.PriorityQueue;

public class Task7 {

    public static void main(String[] args) {

        PriorityQueue<String> colors1 = Task1.createColorQueue();
        PriorityQueue<String> colors2 = Task1.createColorQueue();

        System.out.println(colors1);
        System.out.println(colors2);

        for (String s : colors1) {
            System.out.print(colors2.contains(s)? "true " : "false ");
        }
    }
}
