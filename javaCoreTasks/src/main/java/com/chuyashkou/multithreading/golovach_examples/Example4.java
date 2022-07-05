package com.chuyashkou.multithreading.golovach_examples;

import lombok.SneakyThrows;

public class Example4 {

    static volatile boolean flag = false;

    @SneakyThrows
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread thread1 = new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    while (flag) Thread.onSpinWait();
                    try {
                        Thread.sleep(100);
                        System.out.println("A   .");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    flag = true;
                }
            });
            Thread thread2 = new Thread(() -> {
                for (int k = 0; k < 10; k++) {
                    while (!flag) Thread.onSpinWait();
                    try {
                        Thread.sleep(100);
                        System.out.println(".   B");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    flag = false;
                }
            });

            thread1.start();
            thread2.start();

            thread2.join();

            System.out.println("-----");
            for (int a = 0; a < 10; a++) {
                Thread.sleep(100);
                System.out.println("  C");
            }
            System.out.println("-----");
        }
    }
}
