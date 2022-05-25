package chuyashkou.lesson11;

/*Написать программу, выполняющую поиск в файле шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на
страницу.*/

import java.io.File;
import java.util.Arrays;

public class Task13 {

    public static void main(String[] args) {

        String text = TextReaderIO.readTextFromFileByBufferedReader(new File("files/fileTask13.txt"));
        Long[] hexNumbers = TextHandler.getHexNumbers(text);

        System.out.println(Arrays.toString(hexNumbers));
        for (Long hexNumber : hexNumbers) {
            System.out.printf("[%s] ", Long.toHexString(hexNumber));
        }
    }
}
