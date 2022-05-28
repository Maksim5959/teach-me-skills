package com.chuyashkou.lesson_string;


/*8. Регулярное выражение, описывающее ссылку
 Написать регулярное выражение для поиска ссылки к примеру google.com*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {

    public static void main(String[] args) {
        findLink("There are google.com, yandex.ru, tut.by sites. ");
    }

    private static void findLink(String s) {
        Pattern pattern = Pattern.compile("\\w+\\.(ru|by|com)");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(s.substring(matcher.start(), matcher.end()).trim());
        }
    }
}
