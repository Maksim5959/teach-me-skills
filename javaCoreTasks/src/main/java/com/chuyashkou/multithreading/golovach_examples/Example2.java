package com.chuyashkou.multithreading.golovach_examples;

public class Example2 {

    public static void main(String[] args) {

        Thread[] threads = new Thread[2];

        threads[0] = new Thread(() -> {
            try {
                System.out.println("thread 0 started");
                threads[1].join();
                System.out.println("thread 0 finished");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        threads[1] = new Thread(() -> {
            try {
                System.out.println("thread 1 start");
                threads[0].join();
                System.out.println("thread 1 finished");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        threads[0].start();
        threads[1].start();
    }
}
