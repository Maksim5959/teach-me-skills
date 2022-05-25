package chuyashkou.regex;

//Поиск високосного года регулярным выражением.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public static void main(String[] args) {

        String text = "2000";
        String regex = "^(([1-9]\\d)(0[48]|[2468][048]|[13579][26])|(([2468][048]|[13579][26])00))$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.find());
    }
}
