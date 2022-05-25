package chuyashkou.collections.w3resourceTasks.arrayList;

//21. Write a Java program to replace the second element of a ArrayList with the specified element.

import java.util.List;

public class Task21 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        System.out.println(colors);
        colors.set(1, "black");
        System.out.println(colors);
    }
}
