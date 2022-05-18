package chuyashkou.streamApi.tms;

//3. Вывести мар - человек и сумма баллов по хобби с убыванием по баллам

import chuyashkou.streamApi.tms.generator.PeopleGenerator;
import chuyashkou.streamApi.tms.model.Hobby;
import chuyashkou.streamApi.tms.model.People;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {

        List<People> peopleList = PeopleGenerator.getPeoples();

        peopleList.stream().collect(Collectors
                .groupingBy(Function.identity(), Collectors
                        .flatMapping(people -> people.getHobbies().stream(), Collectors
                                .summingInt(Hobby::getMark)))).entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<People, Integer>::getValue).reversed())
                .forEach(System.out::println);
    }
}
