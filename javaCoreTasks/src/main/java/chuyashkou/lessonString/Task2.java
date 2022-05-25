package chuyashkou.lessonString;

/*2. Составляем строку с помощью класса StringBuilder
Дано два числа, например 3 и 56, необходимо составить следующие строки:
3 + 56 = 59
3 – 56 = -53
3 * 56 = 168.
Используем метод StringBuilder.append().
Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
Замените символ “=” на слово “равно”. Используйте метод StringBuilder.replace().*/

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        int valueA = 3;
        int valueB = 56;

        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();

        System.out.println(stringBuilder1.append(valueA).append(" + ").append(valueB).append(" = ").append(valueA + valueB).toString());
        System.out.println(stringBuilder2.append(valueA).append(" - ").append(valueB).append(" = ").append(valueA - valueB).toString());
        System.out.println(stringBuilder3.append(valueA).append(" * ").append(valueB).append(" = ").append(valueA * valueB).toString());

        StringBuilder[] stringBuilders = {stringBuilder1, stringBuilder2, stringBuilder3};
        Random random = new Random();
        if (random.nextInt(2) == 1) {
            System.out.println("By delete and insert methods.");

            for (StringBuilder stringBuilder : stringBuilders) {
                stringBuilder.delete(7, 8);
                stringBuilder.insert(7, "равно");
                System.out.println(stringBuilder.toString());
            }
        } else {
            System.out.println("By replace method.");

            for (StringBuilder stringBuilder : stringBuilders) {
                stringBuilder.replace(7, 8, "равно");
                System.out.println(stringBuilder.toString());
            }
        }
    }
}
