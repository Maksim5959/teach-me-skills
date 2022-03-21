package chuyashkou.lesson5;

/*7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
какой элемент является в этом массиве максимальным и сообщите индекс его
последнего вхождения в массив.*/

import java.util.Random;

public class Task7 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] values = new int[12];
        int max = values[0];
        int index = 0;

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(16);
            if (values[i] >= max) {
                max = values[i];
                index = i;
            }
            System.out.print(values[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальное число в массиве - " + max + ", индекс его последнего вхождения в массив - " + index);
    }
}
