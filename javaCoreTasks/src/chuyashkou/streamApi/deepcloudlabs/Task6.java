package chuyashkou.streamApi.deepcloudlabs;

//6. Find the words starting with the letter a, and ends with the letter z.

import java.util.List;
import java.util.Objects;

public class Task6 {

    public static void main(String[] args) {

        List<String> words = Task1.getWordsList();

        words.stream().filter(s -> Objects.toString(s.charAt(0)).matches("[Aa]")
                && Objects.toString(s.charAt(s.length() - 1)).matches("[Zz]"))
                .forEach(System.out::println);
    }
}
