package chuyashkou.lessonString;

/*1. Практика методов класса String
Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
Распечатать последний символ строки. Используем метод String.charAt().
Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
Найти позицию подстроки “Java” в строке “I like Java!!!”.
Заменить все символы “а” на “о”.
Преобразуйте строку к верхнему регистру.
Преобразуйте строку к нижнему регистру.
Вырезать строку Java c помощью метода String.substring().*/

public class Task1 {

    public static void main(String[] args) {
        stringFormatter("I like Java!!!");
    }

    private static void stringFormatter(String s) {

        System.out.println("Последний символ строки - " + s.charAt(s.length() - 1));

        if (s.endsWith("!!!")) {
            System.out.println("Строка заканчивается на '!!!'");
        } else {
            System.out.println("Строка не заканчивается на '!!!'");
        }

        if (s.startsWith("I like")) {
            System.out.println("Строка начинается на 'I like'");
        } else {
            System.out.println("Строка не начинается на 'I like'");
        }

        if (s.contains("Java")) {
            System.out.println("Строка содержит подстроку 'Java'");
        } else {
            System.out.println("Строка не содержит подстроку 'Java'");
        }

        if (s.indexOf("Java") > 0) {
            System.out.println("Подстрока " + s.substring(s.indexOf("Java"), s.lastIndexOf("Java") + 4)
                    + " начинается с индекса " + s.indexOf("Java"));
        } else {
            System.out.println("Заданной подстроки нет в строке");
        }

        System.out.println("Символы 'a' заменяем на 'o' = " + s.replace('a', 'o'));

        System.out.println("Строка в верхнем регистре - " + s.toUpperCase());

        System.out.println("Строка в нижнем регистре - " + s.toLowerCase());
    }
}
