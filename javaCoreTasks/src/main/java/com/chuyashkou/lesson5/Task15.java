package com.chuyashkou.lesson5;

/*
5) «Сожмите» массив, выбросив из него каждый второй элемент.
«Освободившиеся» места массива заполните нулями.
*/

public class Task15 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                array[i] = array[i * 2];
            }
        } else {
            for (int i = 0; i < (array.length / 2) + 1; i++) {
                array[i] = array[2 * i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 == 0 && i >= array.length / 2) {
                array[i] = 0;
            } else if (array.length % 2 != 0 && i >= array.length / 2 + 1) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
