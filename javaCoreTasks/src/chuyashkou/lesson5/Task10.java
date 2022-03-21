package chuyashkou.lesson5;

/*10)Пользователь вводит с клавиатуры число больше 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.*/

import java.util.Random;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Введите натуральное целое число больше 3: ");
            n = scanner.nextInt();
            if (n > 3) {
                scanner.close();
                break;
            } else {
                System.out.println("Число введено неверно.");
            }
        }

        int[] array = new int[n];
        int countPosNumbers = 0;

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                countPosNumbers++;
            }
        }

        int[] posNumbersArray = new int[countPosNumbers];
        int maxIndexPosNumbersArray = countPosNumbers - 1;
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                posNumbersArray[maxIndexPosNumbersArray] = array[i];
                System.out.print(posNumbersArray[maxIndexPosNumbersArray] + " ");
                maxIndexPosNumbersArray--;
            }
        }
    }
}
