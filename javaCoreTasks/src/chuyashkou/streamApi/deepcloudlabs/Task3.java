package chuyashkou.streamApi.deepcloudlabs;

//3. Group the dictionary words by first letters

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {

        List<String> words = Task1.getWordsList();

        words.stream().collect(Collectors.groupingBy(s -> s.substring(0,1))).entrySet().forEach(System.out::println);
    }
}
