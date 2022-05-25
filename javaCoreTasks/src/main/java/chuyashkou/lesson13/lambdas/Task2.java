package chuyashkou.lesson13.lambdas;

/*2. Проверка пустой строки.
Создать лямбда выражение, которое возвращает значение true, если строка не null, используя функциональный интерфейс Predicate.
Создать лямбда выражение, которое проверяет, что строка не пуста, используя функциональный интерфейс Predicate.
Написать программу проверяющую, что строка не null и не пуста, используя метод and() функционального интерфейса Predicate.*/

import java.util.Objects;
import java.util.function.Predicate;

public class Task2 {

    public static void main(String[] args) {

        String[] strings = {null, "", "string"};

        Predicate<String> isNotNull = s -> !Objects.isNull(s);
        Predicate<String> isNotEmpty = s -> {
            if (!Objects.isNull(s)) {
                return !s.isEmpty();
            }
            return false;
        };

        for (String s : strings) {
            System.out.println(isNotNull.and(isNotEmpty).test(s));
        }
    }
}
