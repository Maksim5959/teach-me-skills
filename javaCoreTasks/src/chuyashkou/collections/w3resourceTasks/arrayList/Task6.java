package chuyashkou.collections.w3resourceTasks.arrayList;

//5. Write a Java program to remove the third element from a array list.

import java.util.List;

public class Task6 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        System.out.println(colors);
        colors.remove(2);
        System.out.println(colors);
    }
}
