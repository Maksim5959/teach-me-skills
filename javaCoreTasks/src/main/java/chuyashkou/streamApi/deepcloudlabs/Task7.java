package chuyashkou.streamApi.deepcloudlabs;

//7. Find the longest word in the dictionary.

import java.util.Comparator;
import java.util.List;

public class Task7 {

    public static void main(String[] args) {

        List<String> words = Task1.getWordsList();


        System.out.println(words.stream().max(Comparator.comparing(String::length, Integer::compareTo)).orElse(""));
    }
}
