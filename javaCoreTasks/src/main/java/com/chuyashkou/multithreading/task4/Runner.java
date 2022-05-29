package com.chuyashkou.multithreading.task4;

/*4. Параллельные целочисленные массивы в потоках.
Условие задачи. Пользователь вводит с клавиатуры значение в массив.
После чего запускаются два потока. Первый поток находит максимум в массиве, второй — минимум.
Результаты вычислений возвращаются в метод main().

Решение. Данная задача решается с объявлением одного класса,
в котором реализованы одновременно поиск минимального и максимального элемента массива.
По желанию, можно реализовать два отдельных класса, которые будут определять соответствующие потоки.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

        Searcher searcher = new Searcher(new ArrayList<>());

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                System.out.println("Enter the number: ");
                searcher.getList().add(Integer.parseInt(bufferedReader.readLine()));

                Thread thread1 = new Thread(searcher::printMin);
                Thread thread2 = new Thread(searcher::printMax);

                thread1.start();
                thread2.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
