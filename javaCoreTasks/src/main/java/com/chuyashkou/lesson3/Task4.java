package com.chuyashkou.lesson3;

/*4) Даны 3 целых числа. Найти количество положительных чисел в исходном
наборе.*/

public class Task4 {

    public static void main(String[] args) {

        int[] values = {-1, 0, 40};
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                count++;
            }
        }
        System.out.println("количество положительных чисел - " + count);
    }
}
