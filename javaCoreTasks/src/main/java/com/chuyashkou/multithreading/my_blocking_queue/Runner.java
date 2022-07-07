package com.chuyashkou.multithreading.my_blocking_queue;


import com.chuyashkou.multithreading.my_blocking_queue.impl.BlockingQueueImplTwo;
import lombok.SneakyThrows;


public class Runner {

    @SneakyThrows
    public static void main(String[] args) {

        BlockingQueue<Integer> blockingQueue = new BlockingQueueImplTwo<>(10, true);
//        BlockingQueue<Integer> blockingQueue = new BlockingQueueImplOne<>(Integer.class, 10);

        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                for (int j = 0; j < Integer.MAX_VALUE; j++) {
                    blockingQueue.put(j);
                }
            }).start();
        }

        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                for (int j = 0; j < Integer.MAX_VALUE; j++) {
                    blockingQueue.take();
                }
            }).start();
        }
    }
}
