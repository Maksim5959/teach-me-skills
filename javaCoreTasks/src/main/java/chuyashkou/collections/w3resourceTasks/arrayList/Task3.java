package chuyashkou.collections.w3resourceTasks.arrayList;

//3. Write a Java program to insert an element into the array list at the first position.

import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        insertAtTheFirstPosition(colors, "white");
        System.out.println(colors);
    }

    private static void insertAtTheFirstPosition(List<String> colors, String color) {
        colors.add(0, color);
    }
}
