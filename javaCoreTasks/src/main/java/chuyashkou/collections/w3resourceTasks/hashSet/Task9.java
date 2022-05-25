package chuyashkou.collections.w3resourceTasks.hashSet;

//9. Write a Java program to convert a hash set to a List/ArrayList.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task9 {

    public static void main(String[] args) {

        HashSet<String> colors = Task1.createColorSet();
        List<String> colorsList = new ArrayList<>(colors);
        System.out.println(colors);
        System.out.println(colorsList);
    }
}
