package com.chuyashkou.lesson11;

/*4)Текстовый файл содержит текст. После запуска программы в другой файл
        должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
        предложении присутствует слово-палиндром, то не имеет значения какое кол-во
        слов в предложении, оно попадает в новый файл.
        Пишем все в ООП стиле. Создаём класс FileRecorder
        в котором два статических метода:
        1. Метод принимает строку и возвращает кол-во слов в строке.
        2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
        есть возвращает true, если нет false
        В main считываем файл.
        Разбиваем текст на предложения. Используя методы класса FileRecorder
        определяем подходит ли нам предложение. Если подходит добавляем его в
        новый файл*/

import java.io.File;

public class Task4 {

    public static void main(String[] args) {

        String text = TextReaderIO.readTextFromFileByBufferedReader(new File("files/fileTask4.txt"));
        String[] sentences = TextHandler.getSentences(text);
        StringBuilder result = new StringBuilder();

        for (String sentence : sentences) {
            if ((TextHandler.getWordsCount(sentence) >= 3 && TextHandler.getWordsCount(sentence) <= 5)
                    || TextHandler.getPalindrome(sentence).length() > 0) {
                result.append(sentence).append("\n");
            }
        }
        TextWriterIO.writeTextToFileByBufferedWriter(new File("files/fileTask4-1.txt"), result.toString());
    }
}
