package chuyashkou.streamApi.deepcloudlabs;

//5. Count the vowels used in words.

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task5 {

    public static void main(String[] args) {

        List<String> words = Task1.getWordsList();

        words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors
                .flatMapping(s -> Arrays.stream(s.split("")).filter(s1 ->
                        s1.matches("([AaEeIiOoUuYy])")), Collectors.counting())))
                .entrySet().forEach(System.out::println);
    }
}
