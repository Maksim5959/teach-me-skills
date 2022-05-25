package chuyashkou.streamApi.deepcloudlabs;

//2. Find the words starting with the letter n to the end of the dictionary.

import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<String> words = Task1.getWordsList();

        words.stream().filter(s -> s.substring(0, 1).matches("[^A-Ma-m]")).forEach(System.out::println);
    }
}
