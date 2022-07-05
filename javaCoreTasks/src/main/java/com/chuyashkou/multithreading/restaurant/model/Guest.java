package com.chuyashkou.multithreading.restaurant.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Guest implements Runnable{

    private final Restaurant restaurant;

    @Override
    public void run() {
            restaurant.reserveTable();
    }
}
