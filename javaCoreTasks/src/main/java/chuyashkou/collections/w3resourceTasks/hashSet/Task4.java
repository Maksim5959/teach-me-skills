package chuyashkou.collections.w3resourceTasks.hashSet;

//4. Write a Java program to empty an hash set.

import java.util.HashSet;

public class Task4 {

    public static void main(String[] args) {

        HashSet<String> colors = Task1.createColorSet();
        System.out.println(colors);
        colors.clear();
        System.out.println(colors);
    }
}
