package chuyashkou.collections.w3resourceTasks.hashSet;

//10. Write a Java program to compare two hash set.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {

        HashSet<String> colors1 = Task1.createColorSet();
        HashSet<String> colors2 = Task1.createColorSet();
        List<Boolean> compares = new ArrayList<>();

        for (String s : colors1) {
            compares.add(colors2.contains(s));
        }

        System.out.println(colors1);
        System.out.println(colors2);
        System.out.println(compares);
    }
}
