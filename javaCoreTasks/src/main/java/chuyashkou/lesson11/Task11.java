package chuyashkou.lesson11;

/*Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
распечатать.*/

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task11 {

    public static void main(String[] args) {

        Double[] values = TextHandler.getNumbers(TextReaderIO.readTextFromFileByBufferedReader(new File("files/fileTask11.txt")));

        Set<Double> uniqueValues = new HashSet<>();
        double sum = 0;

        System.out.println(Arrays.toString(values));

        for (Double value : values) {
            uniqueValues.add(value);
            sum += value;
        }

        System.out.printf("Sum = %s.\n", sum);
        System.out.println(uniqueValues);
    }
}
