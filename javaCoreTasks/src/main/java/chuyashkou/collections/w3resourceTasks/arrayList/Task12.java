package chuyashkou.collections.w3resourceTasks.arrayList;

//12. Write a Java program to extract a portion of a array list.

import java.util.List;

public class Task12 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        System.out.println(colors);
        System.out.println(colors.subList(0, 3));
    }
}
