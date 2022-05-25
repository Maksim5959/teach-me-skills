package chuyashkou.collections.w3resourceTasks.arrayList;

//8. Write a Java program to sort a given array list.

import java.util.Collections;
import java.util.List;

public class Task8 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        Collections.sort(colors);
        System.out.println(colors);
        colors = Task1.createColorList();
        colors.sort(String::compareTo);
        System.out.println(colors);
    }
}
