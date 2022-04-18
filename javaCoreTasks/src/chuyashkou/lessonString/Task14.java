package chuyashkou.lessonString;

//Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.

import java.util.List;

public class Task14 {

    public static void main(String[] args) {

        List<String> strings = Task13.inputStrings();
        outputStringsToConsole(strings, true);
        outputStringsToConsole(strings, false);
    }

    private static void outputStringsToConsole(List<String> strings, boolean flag) {
        double average;
        double sum = 0.0;
        for (int i = 0; i < strings.size(); i++) {
            sum += strings.get(i).length();
        }
        average = sum / strings.size();
        System.out.println("Average = " + average);
        for (int i = 0; i < strings.size(); i++) {
            if (flag && strings.get(i).length() > average) {
                System.out.println(strings.get(i) + " - " + strings.get(i).length());
            } else if (!flag && strings.get(i).length() < average) {
                System.out.println(strings.get(i) + " - " + strings.get(i).length());
            }
        }
    }
}
