package chuyashkou.collections.examcloudsTasks;

import chuyashkou.lesson11.TextHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*3. Набор чисел
Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.*/

public class Task3 {

    public static void main(String[] args) {

        String line = readFromConsole();
        System.out.println(line);
        System.out.println(deleteCloneValues(line));
        System.out.println(deleteCloneElements(line));
    }

    private static String readFromConsole() {
        StringBuilder result = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            result.append(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    private static Set<Double> deleteCloneValues(String valuesLine) {
        Double[] values = TextHandler.getNumbers(valuesLine);
        return new TreeSet<>(Arrays.asList(values));
    }

    private static Set<String> deleteCloneElements (String line){
        String[] lines = line.split("");
        return new HashSet<>(Arrays.asList(lines));
    }
}
