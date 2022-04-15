package chuyashkou.lessonString;

/*10. Слово с минимальным числом символов
Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры.
Если таких слов несколько, найти первое из них.
Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".*/

import java.util.Arrays;
import java.util.HashSet;

public class Task10 {

    public static void main(String[] args) {
        findMinSymbolsWord(textToWords("fffffffff    ab, fa, 1234! jkjk."));
    }

    private static void findMinSymbolsWord(String[] s) {
        int minSymbolWord = new HashSet<String>(Arrays.asList(s[0].split(""))).size();
        String result = s[0];
        for (String word : s) {
            int wordSymbol = new HashSet<String>(Arrays.asList(word.split(""))).size();
            if (wordSymbol < minSymbolWord) {
                minSymbolWord = wordSymbol;
                result = word;
            }
        }
        System.out.println(result);
    }

    private static String[] textToWords(String s) {
        return s.split("\\p{Punct}\\s+|\\s+|\\p{Punct}");
    }
}
