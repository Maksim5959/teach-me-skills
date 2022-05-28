package com.chuyashkou.lesson4;

/*1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
суммарный путь пробежит спортсмен за 7 дней?*/

public class Task1 {

    public static void main(String[] args) {

        double road = 10;

        for (int i = 0; i < 7; i++) {
            road *= 1.1;
        }

        String result = String.format("%.3f", road);
        System.out.println("Суммарный путь = " + result + " км.");
    }
}
