package chuyashkou.streamApi.tms;

//1. Найти человека с наибольшим кол-вом баллов.

import chuyashkou.streamApi.tms.generator.PeopleGenerator;
import chuyashkou.streamApi.tms.model.Hobby;
import chuyashkou.streamApi.tms.model.People;

import java.util.Comparator;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<People> peopleList = PeopleGenerator.getPeoples();

        System.out.println(peopleList.stream().max(Comparator
                .comparing(people -> people.getHobbies().stream()
                        .mapToInt(Hobby::getMark)
                        .sum(), Integer::compareTo))
                .orElse(new People()));
    }
}
