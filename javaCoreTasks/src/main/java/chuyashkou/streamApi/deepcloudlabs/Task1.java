package chuyashkou.streamApi.deepcloudlabs;

//1. Find the words starting with letters a to m.

import chuyashkou.lesson11.TextHandler;
import chuyashkou.lesson11.TextReaderIO;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        List<String> words = getWordsList();

        words.stream().takeWhile(s -> s.substring(0, 1).matches("[A-Ma-m]")).forEach(System.out::println);
    }

    static List<String> getWordsList() {
        return Arrays.stream(TextHandler.getWords(TextReaderIO.readTextFromFileByBufferedReader(new File("files/fileStreamAPI.txt"))))
                .map(String::strip).collect(Collectors.toList());
    }
}
