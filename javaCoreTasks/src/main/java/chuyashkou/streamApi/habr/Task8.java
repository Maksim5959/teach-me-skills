package chuyashkou.streamApi.habr;

/*Примеры использования Reduce функции
Метод reduce позволяет выполнять агрегатные функции на всей коллекцией (такие как сумма,
нахождение минимального или максимального значение и т.п.),
он возвращает одно значение для стрима, функция получает два аргумента — значение полученное на прошлых шагах и текущее значение.
Условие: Дана коллекция чисел Arrays.asList(1, 2, 3, 4, 2) выполним над ними несколько действий используя reduce:
Получить сумму чисел или вернуть 0 - 12
Вернуть максимум или -1 - 4
Вернуть сумму нечетных чисел или 0 - 4*/

import java.util.Arrays;
import java.util.List;

public class Task8 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 2);

        System.out.println(integerList.stream().reduce(Integer::sum).orElse(0));
        System.out.println(integerList.stream().reduce(Integer::max).orElse(-1));
        System.out.println(integerList.stream().filter(value -> value % 2 != 0).reduce(Integer::sum).orElse(0));
    }
}
