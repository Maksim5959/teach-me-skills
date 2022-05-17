package chuyashkou.streamApi.deepcloudlabs;

//4. Find the palindromes in the dictionary.
// A palindrome is a word, number, phrase,
// or other sequence of characters which reads
// the same backward as forward, such as madam or racecar.

import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<String> words = Task1.getWordsList();

        words.stream().filter(s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())).forEach(System.out::println);
    }
}
