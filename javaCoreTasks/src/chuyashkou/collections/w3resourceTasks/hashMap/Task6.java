package chuyashkou.collections.w3resourceTasks.hashMap;

//6. Write a Java program to get a shallow copy of a HashMap instance.

import java.util.HashMap;

public class Task6 {

    public static void main(String[] args) {

        HashMap<Integer, String> colors1 = Task1.createColorsMap();
        HashMap<Integer, String> colors2 = (HashMap<Integer, String>) colors1.clone();
        System.out.println(colors1);
        System.out.println(colors2);
    }
}
