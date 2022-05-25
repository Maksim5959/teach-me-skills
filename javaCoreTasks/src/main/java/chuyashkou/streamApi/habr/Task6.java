package chuyashkou.streamApi.habr;

/*Примеры использования Sorted функции
Условие: даны две коллекции коллекция строк Arrays.asList(«a1», «a4», «a3», «a2», «a1», «a4»)
и коллекция людей класса People (с полями name — имя, age — возраст, sex — пол),
вида Arrays.asList( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN), new People(«Елена», 42, Sex.WOMEN),
new People(«Иван Иванович», 69, Sex.MAN)). Давайте посмотрим примеры как их можно сортировать:
Отсортировать коллекцию строк по алфавиту - [a1, a1, a2, a3, a4, a4]
Отсортировать коллекцию строк по алфавиту в обратном порядке - [a4, a4, a3, a2, a1, a1]
Отсортировать коллекцию строк по алфавиту и убрать дубликаты - [a1, a2, a3, a4]
Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты - [a4, a3, a2, a1]
Отсортировать коллекцию людей по имени в обратном алфавитном порядке - [{'Петя'}, {'Иван Иванович'}, {'Елена'}, {'Вася'}]
Отсортировать коллекцию людей сначала по полу, а потом по возраст - [{'Вася'}, {'Петя'}, {'Иван Иванович'}, {'Елена'}]*/


import chuyashkou.streamApi.habr.people.People;
import chuyashkou.streamApi.habr.people.Sex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4");
        List<People> peopleList = Arrays.asList(new People("Вася", 16, Sex.MAN), new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN), new People("Иван Иванович", 69, Sex.MAN));

        System.out.println(stringList.stream()
                .sorted()
                .collect(Collectors.toList()));

        System.out.println(stringList.stream()
                .sorted((s1, s2) -> -s1.compareTo(s2))
                .collect(Collectors.toList()));

        System.out.println(stringList.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList()));

        System.out.println(stringList.stream()
                .sorted((s1, s2) -> -s1.compareTo(s2))
                .distinct()
                .collect(Collectors.toList()));

        System.out.println(peopleList.stream()
                .sorted((p1, p2) -> -p1.getName().compareTo(p2.getName()))
                .map(People::getName)
                .collect(Collectors.toList()));

        System.out.println(peopleList.stream()
                .sorted(Comparator.comparing(People::getSex).thenComparing(People::getAge))
                .map(people -> String.format("[%s, возраст - %d]", people.getName(), people.getAge()))
                .collect(Collectors.toList()));
    }
}
