package com.chuyashkou.lesson5;

//1) Почитать сумму четных элементов стоящих на главной диагонали.

import java.util.Random;
import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int size = scanner.nextInt();
        scanner.close();
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(51);
                if (array[i][j] % 100 >= 10) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(" " + array[i][j] + " ");
                }
            }
            System.out.println();
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j && array[i][j] % 2 == 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
