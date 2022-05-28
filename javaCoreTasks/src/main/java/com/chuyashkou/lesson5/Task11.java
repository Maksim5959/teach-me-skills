package com.chuyashkou.lesson5;

/*1) Найти произведение элементов, кратных 3.*/

import java.util.Random;

public class Task11 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[3];
        int multiply = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
            if (array[i] % 3 == 0 && array[i] != 0) {
                multiply *= array[i];
            }
        }
        System.out.println();
        if (multiply != 1) {
            System.out.println(multiply);
        }
    }
}
