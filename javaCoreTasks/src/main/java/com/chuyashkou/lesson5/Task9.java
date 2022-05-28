package com.chuyashkou.lesson5;

/* 9)Пользователь должен указать с клавиатуры положительное число, а
программа должна создать массив указанного размера из случайных целых
чисел из [0;15] и вывести его на экран в строку. После этого программа должна
определить и сообщить пользователю о том, сумма какой половины массива
больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
пользователь введёт неподходящее число, то выдать соответствующее
сообщение*/

import java.util.Random;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int arraySice = 0;
        int sum1 = 0;
        int sum2 = 0;

        while (true) {
            System.out.println("Введите размер массива (целое положительное четное число): ");
            arraySice = scanner.nextInt();
            if (arraySice <= 0 || arraySice % 2 != 0) {
                System.out.println("Число введено неверно.");
                scanner.nextLine();
            } else {
                scanner.close();
                break;
            }
        }

        int[] array = new int[arraySice];

        for (int i = arraySice - 1, j = 0; i >= arraySice / 2 && i >= 0; i--, j++) {
            array[i] = random.nextInt(16);
            array[j] = random.nextInt(16);
            sum1 += array[i];
            sum2 += array[j];
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        if (sum1 > sum2) {
            System.out.println("Сумма чисел первой части массива меньше: " + sum2 + " меньше " + sum1);
        } else if (sum2 > sum1) {
            System.out.println("Сумма чисел первой части массива больше: " + sum2 + " больше " + sum1);
        } else {
            System.out.println("Сумма чисел первой и второй части массива равны");
        }
    }
}
