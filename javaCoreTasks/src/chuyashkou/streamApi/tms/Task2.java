package chuyashkou.streamApi.tms;

/*Условие: дана коллекция класс People (с полями name — имя, age — возраст, sex — пол),
вида Arrays.asList( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN),
new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN)):
Выбрать мужчин-военнообязанных (от 18 до 27 лет) - [{name='Петя', age=23, sex=MAN}]
Найти средний возраст среди мужчин - 36.0
Найти кол-во потенциально работоспособных людей в выборке
(т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)*/

import chuyashkou.streamApi.tms.people.People;
import chuyashkou.streamApi.tms.people.Sex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {

        List<People> peopleList = Arrays.asList(new People("Вася", 16, Sex.MAN), new People("Петя", 23, Sex.MAN),
                new People("Елена", 56, Sex.WOMEN), new People("Иван Иванович", 69, Sex.MAN));

        System.out.println(peopleList.stream()
                .filter(people -> people.getSex() == Sex.MAN && people.getAge() > 17 && people.getAge() < 28)
                .collect(Collectors.toList()));

        System.out.println(peopleList.stream()
                .filter(people -> people.getSex() == Sex.MAN)
                .mapToDouble(People::getAge)
                .average());

        System.out.println(peopleList.stream().filter(people -> {
            if (people.getSex() == Sex.MAN && people.getAge() > 17 && people.getAge() < 60) return true;
            else return people.getSex() == Sex.WOMEN && people.getAge() > 17 && people.getAge() < 55;
        }).count());
    }
}
