package com.chuyashkou.multithreading.golovach_examples.example9.model;

import lombok.SneakyThrows;

public class SingleElementBuffer {

    private Integer element = null;

    @SneakyThrows
    public synchronized void put(int newElement) {
        while (this.element != null) {
            this.wait();
        }
        this.element = newElement;
        this.notifyAll();
    }

    @SneakyThrows
    public synchronized int take() {
        while (this.element == null) {
            this.wait();
        }
        Integer result = this.element;
        this.element = null;
        this.notifyAll();
        return result;
    }
}
