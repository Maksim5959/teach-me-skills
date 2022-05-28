package com.chuyashkou.lesson3;

/*7) (Дополнительно) В переменную записываете количество программистов. В
зависимости от количества программистов необходимо вывести правильно
окончание. Например:
        • 2 программиста
        • 1 программист
        • 10 программистов
        • и т.д.*/

public class Task7 {

    public static void main(String[] args) {

        int count = 105;

        if ((count % 10 < 1 || count % 10 > 4) || (count % 100 > 10 && count % 100 < 20)) {
            System.out.println(count + " программистов.");
        } else if (count % 10 == 1 && count != 11) {
            System.out.println(count + " программист.");
        } else {
            System.out.println(count + " программиста.");
        }
    }
}
