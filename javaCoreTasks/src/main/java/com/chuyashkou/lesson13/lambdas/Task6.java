package com.chuyashkou.lesson13.lambdas;

/*6. Лямбда для Supplier.
Написать лямбда выражение, которое возвращает случайное число от 0 до 10. Используем функциональный интерфейс Supplier.*/

import java.util.Random;
import java.util.function.Supplier;

public class Task6 {

    public static void main(String[] args) {

        Supplier<Integer> randomValue = () -> {
            Random random = new Random();
            return random.nextInt(11);
        };

        for (int i = 0; i < 20; i++) {
            System.out.println(randomValue.get());
        }
    }
}
