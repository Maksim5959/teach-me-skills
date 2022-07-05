package com.chuyashkou.multithreading.golovach_examples;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

public class Example7 {

    public static void main(String[] args) {

        Bacterium bacterium = new Bacterium(1);
        Thread thread = new Thread(bacterium::multiply);
        thread.start();
    }

    private static String spaces(int count) {
        return "" + " ".repeat(Math.max(0, count));
    }

    @AllArgsConstructor
    public static class Bacterium {

        private final int count;

        @SneakyThrows
        public void multiply (){
            for (int i = 0; i < count; i++) {
                Runnable printer = new Example3.PrintRunnable(String.format("%s%d",spaces(i),i), 100);
                Thread thread = new Thread(printer);
                thread.start();
            }
            Bacterium bacterium = new Bacterium(count*2);
            bacterium.multiply();
        }
    }
}
