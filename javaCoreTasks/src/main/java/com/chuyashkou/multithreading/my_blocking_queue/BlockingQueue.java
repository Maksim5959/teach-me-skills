package com.chuyashkou.multithreading.my_blocking_queue;

public interface BlockingQueue <T>{

    void put (T t);

    T take ();
}
