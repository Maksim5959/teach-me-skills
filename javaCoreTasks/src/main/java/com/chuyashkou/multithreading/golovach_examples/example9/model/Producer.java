package com.chuyashkou.multithreading.golovach_examples.example9.model;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class Producer implements  Runnable{

    private int value;
    private final int period;
    private final SingleElementBuffer buffer;

    @SneakyThrows
    @Override
    public void run() {
        while (true){
            System.out.println(value + " produced");
            buffer.put(value++);
            Thread.sleep(period);
        }
    }
}
