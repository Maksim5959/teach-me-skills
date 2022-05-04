package chuyashkou.collections.w3resourceTasks.hashSet;

//7. Write a Java program to convert a hash set to an array.

import java.util.Arrays;
import java.util.HashSet;

public class Task7 {

    public static void main(String[] args) {

        HashSet<String> colors = Task1.createColorSet();

        String[] colorsArray1 = colors.toArray(new String[0]);
        System.out.println(colors);
        System.out.println(Arrays.toString(colorsArray1));

        String[] colorsArray2 = new String[colors.size()];
        colorsArray2 = colors.toArray(colorsArray2);
        System.out.println(Arrays.toString(colorsArray2));
    }
}
