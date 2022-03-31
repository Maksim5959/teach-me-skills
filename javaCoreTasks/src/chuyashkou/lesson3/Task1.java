package chuyashkou.lesson3;

/* 1) В переменную записываем число. Надо вывести на экран сколько в этом
числе цифр и положительное оно или отрицательное. Например, "это
однозначное положительное число". Достаточно будет определить, является ли
число однозначным, "двухзначным или трехзначным и более. */

public class Task1 {

    public static void main(String[] args) {

        int value = 123;
        int count = 0;
        String valueType = "";

        for (int i = value; i != 0; i /= 10, count++) {
            if (value > 0) {
                valueType = "положительное";
            } else if (value < 0) {
                valueType = "отрицательное";
            }
        }

        switch (count) {
            case 1:
                System.out.println(value + " - однозначное " + valueType + " число.");
                break;
            case 2:
                System.out.println(value + " - двухзначное " + valueType + " число.");
                break;
            case 3:
                System.out.println(value + " - трехзначное " + valueType + " число.");
                break;
            default:
                System.out.println(value + " - " + valueType + " четырехзначное и более число либо ноль.");
                break;
        }
    }
}
