package chuyashkou.collections.w3resourceTasks.hashSet;

//6. Write a Java program to clone a hash set to another hash set.

import java.util.HashSet;

public class Task6 {

    public static void main(String[] args) {

        HashSet<String> colors = Task1.createColorSet();
        HashSet<String> clone = (HashSet<String>) colors.clone();
        System.out.println(colors);
        System.out.println(clone);
    }
}
