package com.chuyashkou.multithreading.task2;

/*2. Создать класс реализующий Runnable
Создать класс, реализующий интерфейс Runnable.
Переопределить run() метод. Создать цикл for. В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка.
Используем статический метод Thread.sleep(), чтобы сделать паузу.
Создать три потока, выполняющих задачу распечатки значений.*/

public class Runner {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThread(), "MyThread1");
        Thread thread2 = new Thread(new MyThread(), "MyThread2");
        Thread thread3 = new Thread(new MyThread(), "MyThread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
