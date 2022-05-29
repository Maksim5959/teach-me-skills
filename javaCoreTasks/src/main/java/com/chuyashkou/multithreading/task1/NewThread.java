package com.chuyashkou.multithreading.task1;

public class NewThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("a ");
        }
        System.out.println();
        System.out.printf("Thread name is %s, thread state is %s\n", this.getName(), this.getState());
    }
}
