package com.chuyashkou.lesson5;

/*4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
массив на экран в строку. Замените каждый элемент с нечётным индексом на
ноль. Снова выведете массив на экран на отдельной строке.*/

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] values = new int[20];

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(21);
            System.out.print(values[i] + " ");
            if (i % 2 != 0) {
                values[i] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
}
