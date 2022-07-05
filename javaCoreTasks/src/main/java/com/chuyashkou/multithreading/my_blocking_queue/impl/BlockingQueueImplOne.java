package com.chuyashkou.multithreading.my_blocking_queue.impl;

import com.chuyashkou.multithreading.my_blocking_queue.BlockingQueue;
import lombok.SneakyThrows;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BlockingQueueImplOne<T> implements BlockingQueue<T> {

    private final T[] buffer;
    private int takeIndex = 0;
    private int putIndex = 0;

    public BlockingQueueImplOne(Class<T> tClass, int capacity) {
        this.buffer = (T[]) Array.newInstance(tClass, capacity);
    }

    @Override
    @SneakyThrows
    public synchronized void put(T t) {
        while (buffer[putIndex] != null) {
            wait();
        }
        buffer[putIndex] = t;
        if (putIndex == buffer.length - 1) {
            putIndex = 0;
        } else {
            ++putIndex;
        }
        notifyAll();
    }

    @Override
    @SneakyThrows
    public synchronized T take() {
        while (buffer[takeIndex] == null) {
            wait();
        }
        final T t = buffer[takeIndex];
        buffer[takeIndex] = null;
        if (takeIndex == buffer.length - 1) {
            takeIndex = 0;
        } else {
            ++takeIndex;
        }
        notifyAll();
        return t;
    }

    @Override
    public String toString() {
        return Arrays.toString(buffer);
    }
}
