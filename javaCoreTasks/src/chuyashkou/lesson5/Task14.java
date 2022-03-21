package chuyashkou.lesson5;

/*4) Найти наименьший нечетный элемент.*/

import java.util.Random;

public class Task14 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[4];
        int minNegativNumber = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
            if (array[i] % 2 != 0 && minNegativNumber > array[i]) {
                minNegativNumber = array[i];
            }
        }

        System.out.println();
        System.out.println(minNegativNumber);
    }
}
