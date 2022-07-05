package com.chuyashkou.multithreading.restaurant.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Waiter implements Runnable {

    private final Restaurant restaurant;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            restaurant.releaseTable();
        }
    }
}
