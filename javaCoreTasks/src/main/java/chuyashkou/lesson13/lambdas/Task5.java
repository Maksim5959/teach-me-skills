package chuyashkou.lesson13.lambdas;

/*5. Лямбда для Function.
Написать лямбда выражение, которое принимает на вход число и возвращает значение
“Положительное число”, “Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.*/

import java.util.function.Function;

public class Task5 {

    public static void main(String[] args) {

        int[] values = {-2, -3, 0, 1, 2, 3};

        Function<Integer, String> valueInfo = value -> {
            if (value == 0) return "Ноль";
            return value > 0 ? "Положительное число" : "Отрицательное число";
        };

        for (int value : values) {
            System.out.println(valueInfo.apply(value));
        }
    }
}
