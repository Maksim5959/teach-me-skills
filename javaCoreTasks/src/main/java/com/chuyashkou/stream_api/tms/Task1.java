package com.chuyashkou.stream_api.tms;

//1. Найти человека с наибольшим кол-вом баллов.

import com.chuyashkou.stream_api.tms.generator.PeopleGenerator;
import com.chuyashkou.stream_api.tms.model.Hobby;
import com.chuyashkou.stream_api.tms.model.People;

import java.util.Comparator;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<People> peopleList = PeopleGenerator.getPeoples();

        System.out.printf("\nHuman with max sum of marks - %s", peopleList.stream()
                .peek(System.out::println)
                .max(Comparator.comparing(people -> people.getHobbies().stream()
                        .mapToInt(Hobby::getMark)
                        .sum(), Integer::compareTo))
                .orElse(new People()));
    }
}