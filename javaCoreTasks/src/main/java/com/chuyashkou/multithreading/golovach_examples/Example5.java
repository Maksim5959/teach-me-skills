package com.chuyashkou.multithreading.golovach_examples;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

public class Example5 {

    @SneakyThrows
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            Printer printerA = new Printer();
            Printer printerB = new Printer();
            Printer printerC = new Printer();

            for (int i = 0; i < 10; i++) {
                Thread thread1 = new Thread(printerA::printA);
                Thread thread2 = new Thread(printerB::printB);
                Thread thread3 = new Thread(printerC::printC);

                thread1.start();
                thread2.start();

                try {
                    thread1.join();
                    thread2.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                thread3.start();
                try {
                    thread3.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
    }

    @AllArgsConstructor
    public static class Printer {

        static volatile boolean flag = false;

        @SneakyThrows
        public void printA() {
            for (int j = 0; j < 10; j++) {
                while (flag) Thread.onSpinWait();
                Thread.sleep(100);
                System.out.println("A   .");
                flag = true;
            }
        }

        @SneakyThrows
        public void printB() {
            for (int k = 0; k < 10; k++) {
                while (!flag) Thread.onSpinWait();
                Thread.sleep(100);
                System.out.println(".   B");
                flag = false;
            }
        }

        @SneakyThrows
        public void printC() {
            System.out.println("-----");
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                System.out.println("  C");
            }
            System.out.println("-----");
        }
    }
}


