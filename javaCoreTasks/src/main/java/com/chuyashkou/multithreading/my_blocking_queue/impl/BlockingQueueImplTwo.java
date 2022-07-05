package com.chuyashkou.multithreading.my_blocking_queue.impl;

import com.chuyashkou.multithreading.my_blocking_queue.BlockingQueue;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class BlockingQueueImplTwo<T> implements BlockingQueue<T> {

    private final ReentrantLock lock;
    private final Condition conditionProd;
    private final Condition conditionCons;
    private final Object[] item;
    private int takeIndex;
    private int putIndex;
    private int size;


    public BlockingQueueImplTwo(int capacity) {
        this(capacity, false);
    }

    public BlockingQueueImplTwo(int capacity, boolean fair) {
        this.item = new Object[capacity];
        if (capacity <= 0) throw new IllegalArgumentException("Invalid capacities value");
        this.lock = new ReentrantLock(fair);
        this.conditionCons = lock.newCondition();
        this.conditionProd = lock.newCondition();
        this.size = 0;
        this.takeIndex = 0;
        this.putIndex = 0;
    }

    @Override
    public void put(T t) {
        try {
            lock.lock();
            while (size == item.length) {
                conditionProd.await();
            }
            item[putIndex] = t;
            if (++putIndex == item.length) putIndex = 0;
            size++;
            Thread.sleep(300);
            System.out.println(this);
            conditionCons.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public T take() {
        try {
            lock.lock();
            while (size == 0) {
                conditionCons.await();
            }
            final Object o = item[takeIndex];
            item[takeIndex] = null;
            if (++takeIndex == item.length) takeIndex = 0;
            size--;
            Thread.sleep(300);
            System.out.println(this);
            conditionProd.signal();
            return (T) o;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return Thread.currentThread().getName() + " - " + Arrays.stream(item)
                .filter(Objects::nonNull)
                .collect(Collectors.toList())
                .toString() + " = " + size;
    }
}
