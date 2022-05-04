package chuyashkou.collections.w3resourceTasks.arrayList;

//17. Write a Java program to empty an array list.


import java.util.List;

public class Task17 {

    public static void main(String[] args) {

        List<String> colors = Task1.createColorList();
        System.out.println(colors);
        colors.removeAll(colors);
        System.out.println(colors);
    }
}
