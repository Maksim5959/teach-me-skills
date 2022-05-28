package com.chuyashkou.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TextHandler {

    //([а-яА-Я0-9_]|[\w]|[0-9][.,])[а-яА-Я\w\s,’:()]+([.,]\d+[а-яА-Я\w\s,()]*)*([;.…]|[!?]+)
    private static final String REGEX_FOR_SPLIT_TO_SENTENCES = "\\w.+?[;….!?]((?=\\s+)|$)";
    private static final String REGEX_FOR_SPLIT_TO_WORDS = "([!.…,?:;-]+\\s+|[!.…,?;-]+$|\\s+)";
    private static final String PUNCTUATION_REGEX = "([\\p{Punct}…]\\s+|[\\p{Punct}…]$|[!?])";
    private static final String SEARCH_NUMBERS_REGEX = "(\\d+([.,])\\d+|\\d+)";
    private static final String SEARCH_HEX_NUMBERS_REGEX = "0x[A-Za-z0-9]+";

    public static String[] getSentences(String text) {
        List<String> sentences = new ArrayList<>();
        Pattern pattern = Pattern.compile(REGEX_FOR_SPLIT_TO_SENTENCES,Pattern.DOTALL | Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            sentences.add(text.substring(matcher.start(), matcher.end()).replace('\n', ' '));
        }
        return sentences.toArray(new String[0]);
    }

    public static String[] getWords(String text) {
        return text.split(REGEX_FOR_SPLIT_TO_WORDS);
    }

    public static int getWordsCount(String text) {
        return text.split(REGEX_FOR_SPLIT_TO_WORDS).length;
    }

    public static int getPunctuationCount(String text) {
        int counter = 0;
        Pattern pattern = Pattern.compile(PUNCTUATION_REGEX);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    public static String getPalindrome(String text) {
        StringBuilder result = new StringBuilder();
        for (String word : getWords(text)) {
            if (word.length() > 1 && word.equalsIgnoreCase(new StringBuffer(word).reverse().toString())) {
                result.append(word).append("\n");
            }
        }
        return result.toString();
    }

    public static boolean isBlackSentence(String sentence, String[] blackList) {
        for (String word : getWords(sentence)) {
            for (String blackWord : blackList) {
                if (word.equalsIgnoreCase(blackWord)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Double[] getNumbers(String text) {
        List<Double> values = new ArrayList<>();
        Pattern pattern = Pattern.compile(SEARCH_NUMBERS_REGEX);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            values.add(Double.parseDouble(text.substring(matcher.start(), matcher.end()).replace(',', '.')));
        }
        return values.toArray(new Double[0]);
    }

    public static Long[] getHexNumbers(String text) {
        List<Long> values = new ArrayList<>();
        Pattern pattern = Pattern.compile(SEARCH_HEX_NUMBERS_REGEX);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            values.add(Long.parseLong(text.substring(matcher.start() + 2, matcher.end()), 16));
        }
        return values.toArray(new Long[0]);
    }
}
