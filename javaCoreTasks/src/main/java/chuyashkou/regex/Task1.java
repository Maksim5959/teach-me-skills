package chuyashkou.regex;

//Написать регулярное выражение для IPV4

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args){

        String text = "255.255.255.6";
        String regex = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)([.]|$)){4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.find());
    }
}
