package chuyashkou.lesson11;

import java.io.File;
import java.util.Arrays;
import java.util.Random;


/*Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.*/

public class Task12 {

    public static void main(String[] args) {

        Random random = new Random();
        int [] values = new int[20];
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            values [i] = random.nextInt(101);
            sum += values [i];
        }

        TextWriterIO.writeIntToFileByDataOutputStream(new File("files/fileTask12.dat"),values);
        Integer [] readValues = TextReaderIO.readIntValueFromFileByDataInputStream(new File("files/fileTask12.dat"));

        System.out.printf("Average of numbers %s = %s.", Arrays.toString(readValues), sum/20);
    }
}

