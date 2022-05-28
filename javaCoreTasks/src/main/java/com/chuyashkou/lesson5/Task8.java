package com.chuyashkou.lesson5;

/*8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
массива должен равняться отношению элемента из первого массива с i-ым
индексом к элементу из второго массива с i-ым индексом. Вывести все три
массива на экран (каждый на отдельной строке), затем вывести количество
целых элементов в третьем массиве.*/

import java.util.Random;

public class Task8 {

    public static void main(String[] args) {

        Random random = new Random();
        double[] values1 = new double[10];
        double[] values2 = new double[10];
        double[] values3 = new double[10];
        int count = 0;

        for (int i = 0; i < values1.length; i++) {

            values1[i] = random.nextInt(10);
            values2[i] = random.nextInt(9) + 1;
            values3[i] = values1[i] / values2[i];

            if (values3[i] % 1 == 0) {
                count++;
            }
        }

        for (double i : values1) {
            System.out.print(Math.round(i) + " ");
        }
        System.out.println();
        for (double i : values2) {
            System.out.print(Math.round(i) + " ");
        }
        System.out.println();
        for (double i : values3) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Количество целых чисел третьего массива = " + count);
    }
}
