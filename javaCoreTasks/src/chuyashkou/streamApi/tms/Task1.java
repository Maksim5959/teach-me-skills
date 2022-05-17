package chuyashkou.streamApi.tms;

/*Условие: дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»),
давайте посмотрим как её можно обрабатывать используя методы
filter, findFirst, findAny, skip и count:
Вернуть количество вхождений объекта «a1» - 2
Вернуть первый элемент коллекции или 0, если коллекция пуста - a1
Вернуть последний элемент коллекции или «empty», если коллекция пуста - a1
Найти элемент в коллекции равный «a3» или кинуть ошибку - a3
Вернуть третий элемент коллекции по порядку - a3
Вернуть два элемента начиная со второго - [a2, a3]
Выбрать все элементы по шаблону - [a1, a1]*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a1", "a2", "a3", "a1", "a5");
        System.out.println(stringList.stream().filter("a1"::equals).count());
        System.out.println(stringList.stream().findFirst().orElse("0"));
        System.out.println(stringList.stream().skip(stringList.size() - 1).findAny().orElse("empty"));
        System.out.println(stringList.stream().filter("a3"::equals).findAny().orElseThrow());
        System.out.println(stringList.stream().skip(2).findFirst().orElse("empty"));
        System.out.println(stringList.stream().skip(1).limit(2).collect(Collectors.toList()));
        System.out.println(stringList.stream().filter(s -> s.contains("1")).collect(Collectors.toList()));
    }
}
