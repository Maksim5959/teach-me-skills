package com.chuyashkou.multithreading.golovach_examples.example9;

import com.chuyashkou.multithreading.golovach_examples.example9.model.Consumer;
import com.chuyashkou.multithreading.golovach_examples.example9.model.Producer;
import com.chuyashkou.multithreading.golovach_examples.example9.model.SingleElementBuffer;
import lombok.SneakyThrows;

public class ProducerConsumerExample1X1 {

    @SneakyThrows
    public static void main(String[] args) {
        SingleElementBuffer singleElementBuffer = new SingleElementBuffer();
        new Thread(new Producer(1,1000, singleElementBuffer)).start();
        Thread.sleep(4000);
        new Thread(new Consumer(singleElementBuffer)).start();

    }
}
