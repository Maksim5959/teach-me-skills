package chuyashkou.streamApi.tms;

/*Условие: дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»), давайте посмотрим
, как её можно обрабатывать используя Match функции:
Найти существуют ли хоть один «a1» элемент в коллекции - true
Найти существуют ли хоть один «a8» элемент в коллекции - false
Найти есть ли символ «1» у всех элементов коллекции	- false
Проверить что не существуют ни одного «a7» элемента в коллекции	- true*/

import java.util.Arrays;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("a1", "a2", "a3", "a1");

        System.out.println(stringList.stream().anyMatch("a1"::equals));
        System.out.println(stringList.stream().anyMatch("a8"::equals));
        System.out.println(stringList.stream().allMatch(s -> s.contains("1")));
        System.out.println(stringList.stream().noneMatch("a7"::equals));
    }
}
