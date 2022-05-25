package chuyashkou.lesson5;

/*3) Найти средне арифметическое элементов массива, превосходящих некоторое
число С.*/

import java.util.Random;

public class Task13 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[4];
        double sum = 0;
        int count = 0;
        int c = 2;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
            if (array[i] > c) {
                sum += array[i];
                count++;
            }
        }

        System.out.println();
        System.out.println(sum / count);
    }
}
