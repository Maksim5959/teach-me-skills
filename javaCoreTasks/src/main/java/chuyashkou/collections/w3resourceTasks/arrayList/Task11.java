package chuyashkou.collections.w3resourceTasks.arrayList;

//11. Write a Java program to reverse elements in a array list.

import java.util.Collections;
import java.util.List;

public class Task11 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        System.out.println(colors);
        Collections.reverse(colors);
        System.out.println(colors);
    }
}
