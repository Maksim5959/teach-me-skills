package com.chuyashkou.multithreading.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.SneakyThrows;

import java.util.Objects;

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
            stringBuilder.replace(0, 1, Objects.toString((char) (stringBuilder.toString().toCharArray()[0] + 1)));
        }
    }
}