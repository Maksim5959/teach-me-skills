package chuyashkou.lesson5;

/*8) Найти второй по величине (т.е. следующий по величине за максимальным)
элемент в массиве.*/

public class Task18 {

    public static void main(String[] args) {

        int[] array = {1, 15, 16, 16, 4, 13, 13, 3};
        boolean needIteration = true;

        for (int i : array) {
            System.out.print(i + " ");
        }

        while (needIteration) {
            needIteration = false;
            for (int i = 1, j = 0; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    j = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = j;
                    needIteration = true;
                }
            }
        }
        System.out.println();

        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] > array[i - 1]) {
                System.out.println(array[i - 1]);
                break;
            }
        }
    }
}
