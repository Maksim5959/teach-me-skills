package chuyashkou.lesson3;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int value = -123;
        String valueType;

        if (value > 0) {
            valueType = value + " - положительное число";
        } else {
            valueType = value + " - отрицательное число";
        }
        int count = 0;

        for (int i = value; i != 0; count++) {
            i /= 10;
        }

        switch (count) {
            case 1: {
                System.out.println(valueType + ", " + "однозначное число.");
                break;
            }
            case 2: {
                System.out.println(valueType + ", " + "двухзначное число число.");
                break;
            }
            case 3: {
                System.out.println(valueType + ", " + "трехзначное число.");
                break;
            }
            default: {
                System.out.println(value + " - ноль.");
                break;
            }
        }


    }
}
