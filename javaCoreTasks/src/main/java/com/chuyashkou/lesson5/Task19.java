package com.chuyashkou.lesson5;

//9) Найти наименьший элемент среди элементов с четными индексами массива

public class Task19 {

    public static void main(String[] args) {

        int[] array = {1, 5, 6, 15, 20, 2, 4, 7, 8, 10};
        int minValue = array[2];

        for (int i : array) {
            System.out.print(i + " ");
        }

        for (int i = 2; i < array.length; i += 2) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println();
        System.out.println(minValue);
    }
}
