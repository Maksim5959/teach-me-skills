package chuyashkou.streamApi.habr;

/*Напишите программу, подсчитывающую в тексте частоту появления слов, и в конце выводящую 10 наиболее часто встречающихся слов.
Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр. Например, в строке
"Мама мыла раму 33 раза!" ровно пять слов: "Мама", "мыла", "раму", "33" и "раза".
Подсчет слов должен выполняться без учета регистра, т.е. "МАМА", "мама" и "Мама" — это одно и то же слово.
Выводите слова в нижнем регистре. Если в тексте меньше 10 уникальных слов, то выводите сколько есть.
Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно упорядочить только по частоте,
то дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке.*/

import java.util.*;
import java.util.stream.Collectors;

public class Task10 {

    public static void main(String[] args) {

        String text = """
                Max max roma roMa igor iVan ivan ivan ivan john irina lora lora
                anastasia 33 33 32 32 25 25 16 16 15 89 89 89 89 89 
                """;
        List<String> words = Arrays.asList(text.split("[,.\\s]+"));
        words.stream()
                .collect(Collectors.toMap(String::toLowerCase, s -> 1, Integer::sum)).entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed().thenComparing(Map.Entry::getKey))
                .limit(10)
                .forEach(System.out::println);
    }
}
