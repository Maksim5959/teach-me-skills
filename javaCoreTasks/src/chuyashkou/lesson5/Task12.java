package chuyashkou.lesson5;

/*2) Найти среднее арифметическое элементов с нечетными номерами.*/

import java.util.Random;

public class Task12 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[4];
        double sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
            if (i % 2 != 0) {
                sum += array[i];
                count++;
            }
        }

        System.out.println();
        System.out.println(sum / count);
    }
}
