package chuyashkou.collections.w3resourceTasks.arrayList;

//19. Write a Java program to trim the capacity of an array list the current list size.

import java.util.ArrayList;

public class Task19 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        ArrayList<String> colors = Task1.createColorList();
        System.out.println(colors);
        colors.trimToSize();
        System.out.println(colors);
    }
}
