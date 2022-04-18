package chuyashkou.lessonString;

//Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task13 {

    public static void main(String[] args) {

        ArrayList<String> strings1 = (ArrayList<String>) inputStrings();
        System.out.println(bubbleSortStrings(strings1));
        System.out.println(reverseStringList(bubbleSortStrings(strings1)));

        ArrayList<String> strings2 = (ArrayList<String>) inputStrings();
        System.out.println(quickSortStrings(strings2, 0, strings2.size() - 1));
        System.out.println(reverseStringList(quickSortStrings(strings2, 0, strings2.size() - 1)));
    }

    protected static List<String> inputStrings() {
        List<String> strings = new ArrayList<>();
        String tmp;

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("Enter new line or '`' to exit: ");
                tmp = bufferedReader.readLine();
                if (!tmp.equalsIgnoreCase("`")) {
                    strings.add(tmp);
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    protected static List<String> reverseStringList(List<String> strings) {
        for (int i = 0; i < (strings.size() - 1) / 2; i++) {
            String tmp = strings.get(i);
            strings.set(i, strings.get(strings.size() - 1 - i));
            strings.set(strings.size() - 1 - i, tmp);
        }
        return strings;
    }

    private static List<String> bubbleSortStrings(List<String> strings) {
        boolean needIterationFlag = true;
        while (needIterationFlag) {
            needIterationFlag = false;
            for (int i = 1; i < strings.size(); i++) {
                if (strings.get(i).length() < strings.get(i - 1).length()) {
                    String tmp = strings.get(i - 1);
                    strings.set(i - 1, strings.get(i));
                    strings.set(i, tmp);
                    needIterationFlag = true;
                }
            }
        }
        return strings;
    }

    private static List<String> quickSortStrings(List<String> strings, int lowIndex, int highIndex) {
        int left = lowIndex;
        int right = highIndex;
        String pivot = strings.get((left + right) / 2);

        while (left < right) {
            while (strings.get(left).length() < pivot.length()) {
                left++;
            }
            while (strings.get(right).length() > pivot.length()) {
                right--;
            }
            if (left <= right) {
                String tmp = strings.get(left);
                strings.set(left, strings.get(right));
                strings.set(right, tmp);
                left++;
                right--;
            }
        }
        if (lowIndex < right) {
            quickSortStrings(strings, lowIndex, right);
        }
        if (left < highIndex) {
            quickSortStrings(strings, left, highIndex);
        }
        return strings;
    }
}
