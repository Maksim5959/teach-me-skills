package com.chuyashkou.multithreading.reentrant_lock_examples.example2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    static ReentrantLock lock = new ReentrantLock(true);
    static Condition condition1 = lock.newCondition();
    static Condition condition2 = lock.newCondition();

    static int product = 0;


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                while (true){
                    try {
                        lock.lockInterruptibly();
                        while (product == 5){
                            condition1.await();
                        }
                        ++product;
                        Thread.sleep(1000);
                        System.out.println(product + " " + Thread.currentThread().getName());
                        condition2.signal();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        lock.unlock();
                    }
                }
            }).start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                while (true){
                    try {
                        lock.lockInterruptibly();
                        while (product == 0){
                            condition2.await();
                        }
                        --product;
                        Thread.sleep(100);
                        System.out.println(product + " " + Thread.currentThread().getName());
                        condition1.signal();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        lock.unlock();
                    }
                }
            }).start();
        }
    }
}
