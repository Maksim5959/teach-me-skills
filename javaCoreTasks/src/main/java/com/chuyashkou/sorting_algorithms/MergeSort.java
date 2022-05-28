package com.chuyashkou.sorting_algorithms;

public class MergeSort {

    //32ms, 100000el
    //13331ms, 100000000el
    public static int [] mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return inputArray;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        return merge(inputArray, leftHalf, rightHalf);
    }

    private static int [] merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
        return inputArray;
    }


    /*public static int[] mergeSort(int[] values) {
        int inputArrayLength = values.length;

        if (inputArrayLength < 2) {
            return values;
        }

        int middle = inputArrayLength / 2;
        int[] leftHalf = new int[middle];
        int[] rightHalf = new int[inputArrayLength - middle];

        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = values[i];
        }

        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = values[middle + i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        return merge(values, leftHalf, rightHalf);
    }

    private static int[] merge(int[] values, int[] leftHalf, int[] rightHalf) {

        int i = 0, j = 0, k = 0;

        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        int valuesLength = values.length;

        while (k < valuesLength && i < leftLength && j < rightLength) {
            if (leftHalf[i] <= rightHalf[j]) {
                values[k] = leftHalf[i];
                i++;
            } else {
                values[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (k < valuesLength && i < leftLength) {
            values[k] = leftHalf[i];
            i++;
            k++;
        }

        while (k < valuesLength && j < rightLength) {
            values[k] = rightHalf[j];
            j++;
            k++;
        }
        return values;
    }*/
}






























