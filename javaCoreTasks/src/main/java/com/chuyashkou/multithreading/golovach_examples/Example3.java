package com.chuyashkou.multithreading.golovach_examples;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

public class Example3 {

    @SneakyThrows
    public static void main(String[] args) {

        for (int i = 0; i < 10; ++i) {
            Runnable runnable1 = new PrintRunnable("A   .", 99);
            Thread thread1 = new Thread(runnable1);
            thread1.start();
            Runnable runnable2 = new PrintRunnable(".   B", 102);
            Thread thread2 = new Thread(runnable2);
            thread2.start();

            thread1.join();
            thread2.join();

            System.out.println("-----");
            Runnable runnable = new PrintRunnable("  C", 100);
            runnable.run();
            System.out.println("-----");
        }
    }

    @AllArgsConstructor
    public static class PrintRunnable implements Runnable {

        String msg;
        long sleepMillis;

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; ++i) {
                    Thread.sleep(sleepMillis);
                    System.out.println(msg);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
