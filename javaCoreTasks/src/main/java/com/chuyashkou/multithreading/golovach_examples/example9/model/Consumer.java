package com.chuyashkou.multithreading.golovach_examples.example9.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Consumer implements Runnable{

    private final SingleElementBuffer buffer;

    @Override
    public void run() {
        while (true){
            Integer element = buffer.take();
            System.out.println(element + " consumed");
        }
    }
}
