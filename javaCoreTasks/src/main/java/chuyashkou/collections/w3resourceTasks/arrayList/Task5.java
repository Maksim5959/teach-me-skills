package chuyashkou.collections.w3resourceTasks.arrayList;

//5. Write a Java program to update specific array element by given element.

import java.util.List;

public class Task5 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        System.out.println(colors);
        colors.set(0, "white");
        System.out.println(colors);
    }
}
