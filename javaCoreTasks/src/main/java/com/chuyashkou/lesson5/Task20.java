package com.chuyashkou.lesson5;

/*10) Найти максимальный элемент в массиве и поменять его местами с нулевым
 элементом*/

public class Task20 {

    public static void main(String[] args) {

        int[] array = {1, 6, 15, 20, 21, 22, 30, 31, 40};
        int maxIndex = 0;
        int maxValue = 0;

        for (int i : array) {
            System.out.print(i + " ");
        }

        for (int i = 0, j = array[0]; i < array.length; i++) {

            if (j < array[i]) {
                maxIndex = i;
                maxValue = array[i];
            }
        }

        array[maxIndex] = array[0];
        array[0] = maxValue;

        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
