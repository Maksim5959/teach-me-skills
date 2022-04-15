package chuyashkou.lessonString;

/*7. Простейшее регулярное выражение
Написать регулярное выражение в примере для нахождения строк cab, ccab, cccab.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {

    public static void main(String[] args) {
        find("cab dsfdsf     ccab   dfsdfsdf    cccab  cccccab");
    }

    private static void find(String s) {
        Pattern pattern = Pattern.compile("(c{1,3}ab)");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(s.substring(matcher.start(), matcher.end()).trim());
        }
    }
}
