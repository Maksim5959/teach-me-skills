package chuyashkou.collections.w3resourceTasks.arrayList;

//13. Write a Java program to compare two array lists.

import java.util.ArrayList;
import java.util.List;

public class Task13 {

    public static void main(String[] args) {

        List<String> colors1 = Task1.createColorList();
        List<String> colors2 = Task1.createColorList();
        System.out.println(colors1.containsAll(colors2));
        System.out.println(colors1);
        System.out.println(colors2);
        compareColorsFromLists(colors1, colors2);
    }

    private static void compareColorsFromLists(List<String> colors1, List<String> colors2) {
        List<Boolean> compares = new ArrayList<>();
        for (String color : colors1) {
            compares.add(colors2.contains(color));
        }
        System.out.println(compares);
    }
}
