package chuyashkou.streamApi.habr;

/*Примеры использования Max и Min функций
Условие: дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»),
и коллекция класса Peoples из прошлых примеров про Sorted и Filter функции:
Найти максимальное значение среди коллекции строк - a3
Найти минимальное значение среди коллекции строк - a1
Найдем человека с максимальным возрастом - {name='Иван Иванович', age=69, sex=MAN}
Найдем человека с минимальным возрастом - {name='Вася', age=16, sex=MAN}*/

import chuyashkou.streamApi.habr.people.People;
import chuyashkou.streamApi.habr.people.Sex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task7 {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("a1", "a2", "a3", "a1");
        List<People> peopleList = Arrays.asList(new People("Вася", 16, Sex.MAN), new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN), new People("Иван Иванович", 69, Sex.MAN));

        System.out.println(stringList.stream().max(String::compareTo).orElse("empty"));
        System.out.println(stringList.stream().min(String::compareTo).orElse("empty"));
        System.out.println(peopleList.stream().max(Comparator.comparing(People::getAge)).orElse(null));
        System.out.println(peopleList.stream().min(Comparator.comparing(People::getAge)).orElse(null));
    }
}
