package chuyashkou.lesson4;

//Напишите программу, которая выводит на консоль таблицу умножения

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((i * j) % 100 >= 10) {
                    System.out.print((i * j) + "  ");
                } else {
                    System.out.print(" " + (i * j) + "  ");
                }
            }
            System.out.println();
        }
    }
}
