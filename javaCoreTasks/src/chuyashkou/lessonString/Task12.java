package chuyashkou.lessonString;

/*12. Найти палиндром
Предложение состоит из нескольких слов, например:
"Если есть хвосты по дз, начните с 1 не сданного задания.
123 324 111 4554". Среди слов, состоящих только из цифр, найти слово палиндром.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task12 {

    public static void main(String[] args) {

        findNumPalindrome("Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554");
    }

    private static void findNumPalindrome(String s) {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            String result = s.substring(matcher.start(), matcher.end());
            if (result.equals(new StringBuilder(result).reverse().toString())) {
                System.out.println(result);
            }
        }
    }
}
