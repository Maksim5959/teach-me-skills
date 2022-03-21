package chuyashkou.lesson5;

//3)Проверить произведение элементов какой диагонали больше.

import java.util.Random;
import java.util.Scanner;

public class Task23 {

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

        int multiply1 = 1;
        int multiply2 = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    multiply1 *= array[i][j];
                }
                if (i + j == size - 1) {
                    multiply2 *= array[i][j];
                }
            }
        }

        if (multiply1 > multiply2) {
            System.out.println("Произведение элементов первой диагонали больше: " + multiply1 + " больше " + multiply2);
        } else if (multiply2 > multiply1) {
            System.out.println("Произведение элементов первой диагонали меньше: " + multiply1 + " меньше " + multiply2);
        } else {
            System.out.println("Произведение элементов диагоналей равны: " + multiply1 + " равно " + multiply2);
        }

    }
}
