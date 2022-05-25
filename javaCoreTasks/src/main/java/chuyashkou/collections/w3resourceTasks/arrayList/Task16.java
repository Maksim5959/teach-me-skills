package chuyashkou.collections.w3resourceTasks.arrayList;

//16. Write a Java program to clone an array list to another array list.

import java.util.ArrayList;

public class Task16 {

    public static void main(String[] args) {

        ArrayList<String> colors = Task1.createColorList();
        System.out.println(colors);
        ArrayList<String> clone = (ArrayList<String>) colors.clone();
        System.out.println(clone);
    }
}
