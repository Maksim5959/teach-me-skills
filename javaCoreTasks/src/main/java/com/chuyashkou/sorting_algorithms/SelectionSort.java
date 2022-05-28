package com.chuyashkou.sorting_algorithms;

public class SelectionSort {

    //4011ms, 100000el
    public static int [] selectionSort (int [] values) {
        int minIndex;
        int tmp;

        for (int i = 0; i < values.length; i++) {
            minIndex = i;
            for (int j = i; j < values.length; j++) {
                if (values [minIndex] > values [j]){
                    minIndex = j;
                }
            }
            tmp = values [minIndex];
            values [minIndex] = values [i];
            values [i] = tmp;
        }
        return values;
    }
}
