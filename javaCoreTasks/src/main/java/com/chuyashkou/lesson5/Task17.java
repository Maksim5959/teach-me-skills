package com.chuyashkou.lesson5;

/*7) Подсчитать, сколько раз встречается элемент с заданным значением.*/

import java.util.Random;

public class Task17 {

    public static void main(String[] args) {

        int[] array = new int[100];
        Random random = new Random();
        int value = 5;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
            if (array[i] == value) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Значение " + value + " встречается в массиве " + count + " раз(а)");
    }

}
