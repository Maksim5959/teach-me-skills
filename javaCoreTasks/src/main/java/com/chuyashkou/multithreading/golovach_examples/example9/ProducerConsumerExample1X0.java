package com.chuyashkou.multithreading.golovach_examples.example9;

import com.chuyashkou.multithreading.golovach_examples.example9.model.Producer;
import com.chuyashkou.multithreading.golovach_examples.example9.model.SingleElementBuffer;

public class ProducerConsumerExample1X0{

    public static void main(String[] args) {

        SingleElementBuffer singleElementBuffer = new SingleElementBuffer();
        new Thread(new Producer (0,1000,singleElementBuffer)).start();
    }
}
