package chuyashkou.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TextHandler {

    private static final String REGEX_FOR_SPLIT_TO_SENTENCES = "([а-яА-Я]|[A-Za-z])[^;.!?…]+[;.!?…]";
    private static final String REGEX_FOR_SPLIT_TO_WORDS = "([\n-,:]\\s+|\\s+)";
    private static final String WORDS_REGEX = "(\\w+|[А-Яа-я0-9_]+)";
    private static final String PUNCTUATION_REGEX = "\\p{Punct}";
    private static final String SEARCH_NUMBERS_REGEX = "(\\d+([.,])\\d+|\\d+)";

    public static String[] getSentences(String text) {
        List<String> sentences = new ArrayList<>();
        Pattern pattern = Pattern.compile(REGEX_FOR_SPLIT_TO_SENTENCES);
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
        int counter = 0;
        Pattern pattern = Pattern.compile(WORDS_REGEX);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            counter++;
        }
        return counter;
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

    public static Double [] getNumbers (String text){
        List<Double> values = new ArrayList<>();
        Pattern pattern = Pattern.compile(SEARCH_NUMBERS_REGEX);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            values.add(Double.parseDouble(text.substring(matcher.start(),matcher.end()).replace(',','.')));
        }
        return  values.toArray(new Double [0]);
    }
}
