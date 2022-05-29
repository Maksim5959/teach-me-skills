package com.chuyashkou.multithreading.task5;

import com.chuyashkou.lesson11.TextWriterIO;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class SaveAsThread extends Thread{

    private final int [] array;
    private final String path;

    @SneakyThrows
    @Override
    public void run() {
        for (int i : array) {
            System.out.printf("%s write \n", this.getName());
            Thread.sleep(500);
            TextWriterIO.writeTextToFileByBufferedWriter(path,String.format("%d ", i),true);
        }
    }
}
