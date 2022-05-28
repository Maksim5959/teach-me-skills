package com.chuyashkou.stream_api.tms;

//2. Вывести мар - человек и сумма баллов по хобби.

import com.chuyashkou.stream_api.tms.generator.PeopleGenerator;
import com.chuyashkou.stream_api.tms.model.Hobby;
import com.chuyashkou.stream_api.tms.model.People;

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
