package com.chuyashkou.multithreading.golovach_examples;

import lombok.SneakyThrows;

public class Example10 {

    @SneakyThrows
    public static void main(String[] args) {

        Thread thread = new Thread(() ->{
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    if(Thread.currentThread().isInterrupted()) System.out.println("I'm true.");
                }
                if(!Thread.currentThread().isInterrupted()) System.out.println("I'm false.");
            }
        });

        thread.start();
        Thread.sleep(3000);
        System.out.println("interrupt");
        thread.interrupt();

        if(thread.isInterrupted()) thread.stop();
    }
}
