package chuyashkou.collections.w3resourceTasks.arrayList;

//15. Write a Java program to join two array lists.

import java.util.List;

public class Task15 {

    public static void main(String[] args) {

        List<String> colors1 = Task1.createColorList();
        List<String> colors2 = Task1.createColorList();
        System.out.printf("%s %s\n", colors1, colors2);
        colors1.addAll(colors2);
        System.out.println(colors1);
    }
}
