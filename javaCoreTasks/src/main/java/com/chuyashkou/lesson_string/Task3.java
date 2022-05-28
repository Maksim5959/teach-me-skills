package com.chuyashkou.lesson_string;

/*3. Заменить каждое второе вхождение строки
Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming» (не учитываем регистр символов) на «OOP».
Например, строка:
"Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic.
Object-oriented programming blabla. Object-oriented programming bla."
должна быть преобразована в:
"Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic.
 OOP blabla. Object-oriented programming bla."*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public static void main(String[] args) {

        String oop = "Object-oriented programming is a programming language model organized around objects rather than \"actions\"" +
                " and data rather than logic. ObjEcT-oRiented programming blabla. Object-oriented programming bla.";
        StringBuilder stringBuilder = new StringBuilder(oop);
        Pattern pattern = Pattern.compile("object-oriented programming");
        Matcher matcher = pattern.matcher(oop.toLowerCase());

        for (int i = 1; matcher.find(); i++) {
            if (i % 2 == 0) {
                stringBuilder.replace(matcher.start(), matcher.end(), "OOP");
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
