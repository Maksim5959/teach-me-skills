package chuyashkou.sortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(createArray(10))));
    }

    private static int[] createArray(int elementsCount) {
        Random random = new Random();
        int[] array = new int[elementsCount];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }

    private static int[] bubbleSort(int[] values) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < values.length; i++) {
                if (values[i] < values[i - 1]) {
                    int tmp = values[i];
                    values[i] = values[i - 1];
                    values[i - 1] = tmp;
                    needIteration = true;
                }
            }
        }
        return values;
    }


    private static int[] quickSort(int[] values, int low, int high) {
        int left = low;
        int right = high;
        int mark = values[(left + right) / 2];
        while (left < right) {
            while (values[left] < mark) {
                left++;
            }
            while (values[right] > mark) {
                right--;
            }
            if (left <= right) {
                int tmp = values[left];
                values[left] = values[right];
                values[right] = tmp;
                left++;
                right--;
            }
        }
        if (low < right) {
            quickSort(values, low, right);
        }
        if (left < high) {
            quickSort(values, left, high);
        }
        return values;
    }

    private static int[] selectionSort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int minInd = i;
            for (int j = i; j < values.length; j++) {
                if (values[minInd] > values[j]) {
                    minInd = j;
                }
            }
            int tmp = values[minInd];
            values[minInd] = values[i];
            values[i] = tmp;
        }
        return values;
    }

    private static int[] insertionSort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            int index = i - 1;
            for (; index >= 0; index--) {
                if (value < values[index]) {
                    values[index + 1] = values[index];
                } else {
                    break;
                }
            }
            values [index + 1] = value;
        }
        return values;
    }
}
