package com.chuyashkou.multithreading.golovach_examples;

import lombok.SneakyThrows;

public class Example8 {

    @SneakyThrows
    public static void main(String[] args) {

        final Object lock = new Object();

        new Thread(() ->{
            System.out.println("RUN: started");
            synchronized (lock){
                System.out.println("I'm in!");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("RUN death!");
            }
        }).start();

        System.out.println("MAIN: start sleep");
        Thread.sleep(1000);
        System.out.println("MAIN: stop sleep");

        synchronized (lock){
            System.out.println("MAIN: i'm in!");
            lock.notify();
        }
    }
}
