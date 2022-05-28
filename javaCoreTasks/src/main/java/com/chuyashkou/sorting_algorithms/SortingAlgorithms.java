package com.chuyashkou.sorting_algorithms;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(createArray(10))));
        System.out.println(Arrays.toString(InsertionSort.insertionSort(createArray(10))));
        System.out.println(Arrays.toString(InsertionSort.binaryInsertionSort(createArray(10))));
        System.out.println(Arrays.toString(SelectionSort.selectionSort(createArray(10))));
        System.out.println(Arrays.toString(ShuttleSort.shuttleSort(createArray(10))));
        System.out.println(Arrays.toString(ShellSort.shellSort(createArray(10))));
        System.out.println(Arrays.toString(MergeSort.mergeSort(createArray(10))));
        System.out.println(Arrays.toString(QuickSort.quickSort(createArray(10), 0, 9)));
        System.out.println(Arrays.toString(RadixSort.radixSort(createArray(10))));

        int[] array = InsertionSort.insertionSort(createArray(10));
        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(array, 50, 0, 9));
        System.out.println(linearSearch(array, 50));
        printUniqueNumbers(new int[]{1, 2, 4, 4, 5, 5, 4, 0, 2, 1, 0, -7, -1, -1, -6});
    }

    private static int[] createArray(int elementsCount) {
        Random random = new Random();
        int[] array = new int[elementsCount];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }

    private static int binarySearch(int[] values, int value, int left, int right) {
        int middle = left + (right - left) / 2;

        if (left >= right && values[middle] != value) {
            return -1;
        }

        if (values[middle] == value) {
            return middle;
        } else if (values[middle] > value) {
            return binarySearch(values, value, left, middle - 1);
        } else if (values[middle] < value) {
            return binarySearch(values, value, middle + 1, right);
        } else {
            return -1;
        }
    }

    private static int linearSearch(int[] values, int value) {
        for (int i = 0; i < values.length; i++) {
            if (value == values[i]) {
                return i;
            }
        }
        return -1;
    }

    private static void printUniqueNumbers(int[] array) {
        int maxValue = array[0];
        int minValue = array[0];
        for (int j : array) {
            maxValue = j > maxValue ? j : maxValue;
            minValue = j < minValue ? j : minValue;
        }
        int[] result = new int[(maxValue - minValue) + 1];
        for (int i : array) {
            result[i - minValue] += 1;
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 1) System.out.printf("%d ", i + minValue);
        }
    }
}
