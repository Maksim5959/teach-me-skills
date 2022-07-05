package com.chuyashkou.multithreading.blocking_queue_example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Runner {

    public static void main(String[] args) {

        BlockingQueue <Integer> blockingQueue = new ArrayBlockingQueue<>(10);

        new Thread(() -> {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                try {
                    Thread.sleep(100);
                    blockingQueue.put(i);
                    System.out.println(blockingQueue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                try {
                    Thread.sleep(300);
                    blockingQueue.take();
                    System.out.println(blockingQueue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
