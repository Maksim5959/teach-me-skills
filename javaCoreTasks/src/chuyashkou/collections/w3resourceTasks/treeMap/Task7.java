package chuyashkou.collections.w3resourceTasks.treeMap;

//7. Write a Java program to sort keys in Tree Map by using comparator.

import java.util.Comparator;
import java.util.TreeMap;

public class Task7 {

    public static void main(String[] args) {

        TreeMap<String, String> colors = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        colors.put("B", "white");
        colors.put("A", "black");
        colors.put("C", "gray");
        System.out.println(colors);
    }
}




