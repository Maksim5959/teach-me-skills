package com.chuyashkou.multithreading.golovach_examples.example9;

import com.chuyashkou.multithreading.golovach_examples.example9.model.Consumer;
import com.chuyashkou.multithreading.golovach_examples.example9.model.Producer;
import com.chuyashkou.multithreading.golovach_examples.example9.model.SingleElementBuffer;

public class ProducerConsumerExample3X2 {

    public static void main(String[] args) {

        SingleElementBuffer singleElementBuffer = new SingleElementBuffer();

        new Thread(new Producer(1,300,singleElementBuffer)).start();
        new Thread(new Producer(100,500,singleElementBuffer)).start();
        new Thread(new Producer(1000,700,singleElementBuffer)).start();

        new Thread(new Consumer(singleElementBuffer)).start();
        new Thread(new Consumer(singleElementBuffer )).start();
    }
}
