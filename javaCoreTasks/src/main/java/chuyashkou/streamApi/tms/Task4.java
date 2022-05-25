package chuyashkou.streamApi.tms;

//4. Вывести мар - пол и люди.

import chuyashkou.streamApi.tms.generator.PeopleGenerator;
import chuyashkou.streamApi.tms.model.People;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {

        List<People> peopleList = PeopleGenerator.getPeoples();

        peopleList.stream().collect(Collectors.groupingBy(People::getGender)).entrySet().forEach(System.out::println);
    }
}
