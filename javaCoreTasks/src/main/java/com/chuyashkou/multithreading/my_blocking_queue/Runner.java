package com.chuyashkou.multithreading.my_blocking_queue;


import com.chuyashkou.multithreading.my_blocking_queue.impl.BlockingQueueImplOne;
import lombok.SneakyThrows;


public class Runner {

    @SneakyThrows
    public static void main(String[] args) {

//        BlockingQueue<Integer> blockingQueue = new BlockingQueueImplTwo<>(10, false);
        BlockingQueue<Integer> blockingQueue = new BlockingQueueImplOne<>(Integer.class, 10);

        for (int i = 0; i < 1; i++) {
            new Thread(() -> {
                for (int j = 0; j < Integer.MAX_VALUE; j++) {
                    blockingQueue.put(j);
                }
            }).start();
        }

        for (int i = 0; i < 1; i++) {
            new Thread(() -> {
                for (int j = 0; j < Integer.MAX_VALUE; j++) {
                    blockingQueue.take();
                }
            }).start();
        }
    }
}
