package chuyashkou.lesson3;

/*5) Даны 3 целых числа. Найти количество положительных и отрицательных
чисел в исходном наборе.*/

public class Task5 {

    public static void main(String[] args) {

        int [] values = {1, -1, -5};
        int countPos = 0;
        int countNeg = 0;

        for (int i = 0; i < values.length; i++) {
            if (values [i] > 0) {
                countPos++;
            } else if (values [i] < 0) {
                countNeg++;
            }
        }
        System.out.println("количество положительных чисел - " + countPos);
        System.out.println("количество отрицательных чисел - " + countNeg);
    }
}
