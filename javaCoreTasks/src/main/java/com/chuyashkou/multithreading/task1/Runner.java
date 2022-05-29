package com.chuyashkou.multithreading.task1;

/*1. Создать класс расширяющий Thread
Создать класс NewThread расширяющий Thread.
Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
Создать экземпляр класса и запустить новый поток.*/

public class Runner {

    public static void main(String[] args) throws InterruptedException {

        NewThread thread = new NewThread();
        thread.setName("MyThread");
        System.out.printf("Thread name is %s, thread state is %s\n", thread.getName(), thread.getState());
        thread.start();
        thread.join();
        System.out.printf("Thread name is %s, thread state is %s\n", thread.getName(), thread.getState());
    }
}
