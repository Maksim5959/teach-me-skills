package com.chuyashkou.lesson5;

/*6) Проверить, различны ли все элементы массива.*/

import java.util.Random;

public class Task16 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[1000000000];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(Integer.MAX_VALUE);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length && counter == 0; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    counter++;
                    break;
                }
            }
        }
        System.out.println();
        if (counter == 0) {
            System.out.println("Все элементы массива различны");
        } else {
            System.out.println("В массиве есть повторяющиеся эллементы");
        }
    }
}
