package chuyashkou.collections.w3resourceTasks.arrayList;

//14. Write a Java program of swap two elements in an array list.

import java.util.List;

public class Task14 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        System.out.println(colors);
        swap(colors, 0, 1);
        System.out.println(colors);
    }

    private static <T> void swap(List<T> list, int index1, int index2) {
        list.set(index1, list.set(index2, list.get(index1)));
    }
}
