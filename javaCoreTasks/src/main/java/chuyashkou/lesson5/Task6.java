package chuyashkou.lesson5;

/*6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
на экран в строку. Определить и вывести на экран сообщение о том, является ли
массив строго возрастающей последовательностью.*/

import java.util.Random;

public class Task6 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] values = new int[4];
        int j = 0;
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(11);
            System.out.print(values[i] + " ");
            if (i > 0 && values[i] > values[i - 1]) {
                j++;
            }
        }
        System.out.println();
        if (j == 3) {
            System.out.println("Массив возрастает.");
        } else {
            System.out.println("Массив не возрастает.");
        }
    }
}
