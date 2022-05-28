package com.chuyashkou.lesson_string;

/*9. Регулярное выражение для нахождения Java X
 Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”
 Найти все подстроки "Java X" и распечатать их.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {

    public static void main(String[] args) {
        findJavaX("Versions: JavA  5, Java 6, Java   7, Java 8, Java 12.");
    }

    private static void findJavaX(String s) {
        Pattern pattern = Pattern.compile("java +\\d{1,2}");
        Matcher matcher = pattern.matcher(s.toLowerCase());

        while (matcher.find()) {
            System.out.println(s.substring(matcher.start(), matcher.end()));
        }
    }
}
