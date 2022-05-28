package com.chuyashkou.lesson5;

/*
5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках. Посчитайте среднее
арифметическое элементов каждого массива и сообщите, для какого из
массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны).
*/


import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] values1 = new int[5];
        int[] values2 = new int[5];
        double sum1 = 0;
        double sum2 = 0;
        String array1 = "";
        String array2 = "";
        double result1 = 0;
        double result2 = 0;

        for (int i = 0; i < values1.length; i++) {
            values1[i] = random.nextInt(16);
            values2[i] = random.nextInt(16);

            array1 += " " + values1[i];
            array2 += " " + values2[i];

            sum1 += values1[i];
            sum2 += values2[i];

            if (i == values1.length - 1) {
                result1 = sum1 / 5;
                result2 = sum2 / 5;
                System.out.println(array1);
                System.out.println(array2);
                if (result1 > result2) {
                    System.out.println("Среднее арифметическое чисел первого массива больше " + result1 + " больше " + result2);
                } else if (result1 < result2) {
                    System.out.println("Среднее арифметическое чисел  второго массива больше " + result2 + " больше " + result1);
                } else {
                    System.out.println("Средние арифметические чисел массивов равны " + result1 + " равно " + result2);
                }
            }
        }
    }
}
