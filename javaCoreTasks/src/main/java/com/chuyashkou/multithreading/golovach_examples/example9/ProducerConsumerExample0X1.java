package com.chuyashkou.multithreading.golovach_examples.example9;

import com.chuyashkou.multithreading.golovach_examples.example9.model.Consumer;
import com.chuyashkou.multithreading.golovach_examples.example9.model.SingleElementBuffer;

public class ProducerConsumerExample0X1 {

    public static void main(String[] args) {

            SingleElementBuffer singleElementBuffer = new SingleElementBuffer();
            new Thread(new Consumer(singleElementBuffer)).start();
    }
}
