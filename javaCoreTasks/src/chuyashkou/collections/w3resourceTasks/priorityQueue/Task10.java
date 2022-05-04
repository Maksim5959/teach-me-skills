package chuyashkou.collections.w3resourceTasks.priorityQueue;

//10. Write a Java program to convert a priority queue to an array containing all of the elements of the queue.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Task10 {

    public static void main(String[] args) {

        PriorityQueue<String> colors = Task1.createColorQueue();
        ArrayList<String> colorsArrayList = new ArrayList<>(colors);
        String [] colorsArray = colors.toArray(new String [0]);

        System.out.println(colors);
        System.out.println(colorsArrayList);
        System.out.println(Arrays.toString(colorsArray));
    }
}
