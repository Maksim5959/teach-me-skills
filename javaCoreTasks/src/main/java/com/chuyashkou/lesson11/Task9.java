package com.chuyashkou.lesson11;

/*Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.*/

import java.io.File;

public class Task9 {

    public static void main(String[] args) {

        String text = TextReaderIO.readTextFromFileByBufferedReader(new File("files/fileTask9.txt"));

        System.out.printf("Word count = %s\n", TextHandler.getWordsCount(text));
        System.out.printf("Punctuation count = %s\n", TextHandler.getPunctuationCount(text));
    }
}
