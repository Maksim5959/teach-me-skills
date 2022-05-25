package chuyashkou.collections.w3resourceTasks.hashMap;

//9. Write a Java program to create a set view of the mappings contained in a map.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task9 {

    public static void main(String[] args) {

        HashMap<Integer, String> colors = Task1.createColorsMap();
        System.out.println(colors);
        Set<Map.Entry<Integer, String>> set = colors.entrySet();
        System.out.println(set);
    }
}
