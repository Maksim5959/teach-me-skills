package chuyashkou.lesson5;

/*1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
затем в столбик (отделяя один элемент от другого началом новой строки). Перед
созданием массива подумайте, какого он будет размера.*/

public class Task1 {

    public static void main(String[] args) {

        int[] values = new int[10];

        for (int i = 2, j = 0; i <= 20; i += 2, j++) {
            values[j] = i;
            System.out.print(values[j] + " ");
        }

        System.out.println();

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
