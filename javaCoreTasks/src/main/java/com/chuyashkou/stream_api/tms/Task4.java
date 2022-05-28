package com.chuyashkou.stream_api.tms;

//4. Вывести мар - пол и люди.

import com.chuyashkou.stream_api.tms.generator.PeopleGenerator;
import com.chuyashkou.stream_api.tms.model.People;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {

        List<People> peopleList = PeopleGenerator.getPeoples();

        peopleList.stream().collect(Collectors.groupingBy(People::getGender)).entrySet().forEach(System.out::println);
    }
}
