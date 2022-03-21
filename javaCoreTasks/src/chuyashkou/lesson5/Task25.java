package chuyashkou.lesson5;

/*5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
строкой и т. д.)*/

import java.util.Random;
import java.util.Scanner;

public class Task25 {

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

        for (int i = 0, trans; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                trans = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = trans;
            }
        }

        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
