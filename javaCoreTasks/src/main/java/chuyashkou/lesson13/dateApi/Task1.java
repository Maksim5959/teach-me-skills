package chuyashkou.lesson13.dateApi;

/*1. Практикуем методы LocalDate
Создайте объект класса LocalDate, указывая дату своего рождения.
Вывести на консоль день недели, день в году, месяц, год.
Создайте  объект класса LocalDate, представляющий текущее время.
Сравните его со своим днем рождения используя методы isAfter(), isBefore().*/

import java.time.LocalDate;

public class Task1 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(1995, 6, 12);
        LocalDate localDate1 = LocalDate.now();

        printBirthdayInformation(localDate);
        System.out.println(localDate.isAfter(localDate1));
        System.out.println(localDate.isBefore(localDate1));
    }

    private static void printBirthdayInformation(LocalDate birthday) {
        System.out.println(birthday.getDayOfWeek());
        System.out.println(birthday.getDayOfYear());
        System.out.println(birthday.getMonth());
        System.out.println(birthday.getYear());
    }
}
