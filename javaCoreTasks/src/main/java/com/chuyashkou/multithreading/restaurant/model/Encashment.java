package com.chuyashkou.multithreading.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Encashment implements Runnable{

    private final Restaurant restaurant;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            restaurant.collect();
        }
    }
}
