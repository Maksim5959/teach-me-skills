package chuyashkou.collections.w3resourceTasks.arrayList;

//18. Write a Java program to test an array list is empty or not.

import java.util.List;

public class Task18 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        System.out.println(colors.isEmpty());
        colors.removeAll(colors);
        System.out.println(colors.isEmpty());
    }
}
