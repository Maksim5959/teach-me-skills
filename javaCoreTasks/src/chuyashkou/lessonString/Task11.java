package chuyashkou.lessonString;

/*11. Найти количество слов
Предложение состоит из нескольких слов, разделенных пробелами.
Например: "One two three раз два три one1 two2 123 ".
Найти количество слов, содержащих только символы латинского алфавита.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {

    public static void main(String[] args) {

        findOnlyLatinSymbolsWord("One two three раз два три one1 two2 123.");
    }

    private static void findOnlyLatinSymbolsWord(String s) {
        Pattern pattern = Pattern.compile("( |^)[A-Za-z]+([A-Za-z]|\\d)");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            if (Pattern.matches("[A-Za-z]+", s.substring(matcher.start(), matcher.end()).trim())) {
                System.out.println(s.substring(matcher.start(), matcher.end()).trim());
            }
        }
    }
}
