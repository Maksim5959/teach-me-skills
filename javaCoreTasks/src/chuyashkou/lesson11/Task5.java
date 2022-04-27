package chuyashkou.lesson11;

/*3) Проверка на цензуру:
        Создаете 2 файла.
        1 - й. Содержит исходный текст.
        2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
        определите сами, хотите каждое слово на новой строке, хотите через запятую
        разделяйте, ваша программа делайте как считаете нужным.
        Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
        встретилось ни одного недопустимого слова, то выводите сообщение о том что
        текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
        сообщение, кол-во предложений не прошедших проверку и сами предложения
        подлежащие исправлению.*/

import java.io.File;
import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        String[] blackList = TextHandler.getWords((TextReaderIO.readTextFromFileByBufferedReader(new File("files/blackListTask5.txt"))));
        String[] sentences = TextHandler.getSentences(TextReaderIO.readTextFromFileByBufferedReader(new File("files/fileTask5.txt")));
        StringBuilder resultSentences = new StringBuilder();
        int countCensoredSentence = 0;

        for (String sentence : sentences) {
            if (TextHandler.isBlackSentence(sentence, blackList)) {
                resultSentences.append(sentence.strip()).append("\n");
                countCensoredSentence++;
            }
        }

        System.out.printf("%s censored sentences:\n%s", countCensoredSentence, resultSentences);
        System.err.printf("Black list: %s", Arrays.toString(blackList));
    }
}
