package chuyashkou.streamApi.tms;

//2. Вывести мар - человек и сумма баллов по хобби.

import chuyashkou.streamApi.tms.generator.PeopleGenerator;
import chuyashkou.streamApi.tms.model.Hobby;
import chuyashkou.streamApi.tms.model.People;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {

        List<People> peopleList = PeopleGenerator.getPeoples();

        peopleList.stream().collect(Collectors
                .groupingBy(Function.identity(), Collectors
                        .flatMapping(people -> people.getHobbies().stream(), Collectors
                                .summingInt(Hobby::getMark)))).entrySet()
                .forEach(System.out::println);
    }
}
