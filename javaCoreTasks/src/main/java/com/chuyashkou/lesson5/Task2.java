package com.chuyashkou.lesson5;

/*2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
порядке (99 97 95 93 ... 7 5 3 1).*/

public class Task2 {
    public static void main(String[] args) {

        int[] values = new int[50];

        for (int i = 1, j = 0; i <= 99; i += 2, j++) {
            values[j] = i;
            System.out.print(values[j] + " ");
        }

        System.out.println();

        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
    }
}
