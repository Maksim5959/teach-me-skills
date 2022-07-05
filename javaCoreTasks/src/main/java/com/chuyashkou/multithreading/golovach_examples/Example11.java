package com.chuyashkou.multithreading.golovach_examples;

public class Example11 {

    public synchronized static void main(String[] args) {

        System.out.print("1 ");
        synchronized (args) {
            System.out.print("2 ");
            try {
                args.wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.print("3 ");
    }
}
