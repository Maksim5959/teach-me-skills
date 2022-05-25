package chuyashkou.collections.w3resourceTasks.priorityQueue;

//12. Write a Java program to change priorityQueue to maximum priorityQueue.

import java.util.PriorityQueue;

public class Task12 {

    public static void main(String[] args) {

        PriorityQueue <Integer> numbers = Task1.createNumbersPriorityQueue();
        System.out.println(numbers);
        Integer nunber;
        while ((nunber = numbers.poll()) != null){
            System.out.println(nunber);
        }

    }
}
