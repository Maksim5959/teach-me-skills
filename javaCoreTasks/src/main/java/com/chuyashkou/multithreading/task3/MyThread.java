package com.chuyashkou.multithreading.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.SneakyThrows;

@AllArgsConstructor
@Getter
public class MyThread extends Thread {

    private final StringBuilder stringBuilder;

    @SneakyThrows
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 10; ++i) {
                System.out.printf("%s print %s\n", this.getName(), stringBuilder);
            }
            System.out.printf("%s increase value %s\n", this.getName(), stringBuilder);
            stringBuilder.append(1);
        }
    }
}
