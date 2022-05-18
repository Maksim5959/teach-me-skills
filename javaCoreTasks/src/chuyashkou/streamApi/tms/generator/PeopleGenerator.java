package chuyashkou.streamApi.tms.generator;

import chuyashkou.streamApi.tms.model.Gender;
import chuyashkou.streamApi.tms.model.Hobby;
import chuyashkou.streamApi.tms.model.People;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class PeopleGenerator {

    public static List<People> getPeoples() {

        Hobby hobby1 = new Hobby("IT", new Random().nextInt(11));
        Hobby hobby2 = new Hobby("Movie", new Random().nextInt(11));
        Hobby hobby3 = new Hobby("Squash", new Random().nextInt(11));

        People people1 = new People("Daniil", 22, Gender.MALE, List.of(hobby1, hobby2));
        People people2 = new People("Klim", 18, Gender.MALE, List.of(hobby1));
        People people3 = new People("Victor", 35, Gender.MALE, List.of(hobby1, hobby3));
        People people4 = new People("Artyom", 23, Gender.MALE, List.of(hobby3, hobby2));
        People people5 = new People("Nastia", 20, Gender.FEMALE, List.of(hobby1, hobby2));

        return Arrays.asList(people1, people2, people3, people4, people5);
    }
}
