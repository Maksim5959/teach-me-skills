package com.chuyashkou.multithreading.golovach_examples;

import lombok.SneakyThrows;

public class Example6 {

    @SneakyThrows
    public static void main(String[] args) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            Runnable printer = new Example3.PrintRunnable(String.format("%s%d",spaces(i),i), 100);
            Thread thread = new Thread(printer);
            thread.start();
            Thread.sleep(100);
        }
    }

    private static String spaces(int count) {
        return "" + " ".repeat(Math.max(0, count));
    }
}
