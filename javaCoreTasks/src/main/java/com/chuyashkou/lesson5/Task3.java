package com.chuyashkou.lesson5;

/*3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
это количество на экран на отдельной строке.*/


import java.util.Random;

public class Task3 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] values = new int[15];

        for (int i = 0, j = 0; i < values.length; i++) {
            values[i] = random.nextInt(100);
            System.out.print(values[i] + " ");
            if (values[i] % 2 == 0 && values[i] != 0) {
                j++;
            }
            if (i == values.length - 1) {
                System.out.println();
                System.out.println("Количество четных чисел - " + j);
            }
        }
    }
}
