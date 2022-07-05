package com.chuyashkou.multithreading.reentrant_lock_examples.example1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Program {

    public static void main(String[] args) {

        Store store=new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        for (int i = 0; i < 10; i++) {
            new Thread(producer).start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(consumer).start();
        }
    }
}
// Класс Магазин, хранящий произведенные товары
class Store{
    private int product=0;
    ReentrantLock locker;
    Condition condition;

    Store(){
        locker = new ReentrantLock(); // создаем блокировку
        condition = locker.newCondition(); // получаем условие, связанное с блокировкой
    }

    public void get() {

        locker.lock();
        try{
            // пока нет доступных товаров на складе, ожидаем
            while (product<1)
                condition.await();

            product--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println("Товаров на складе: " + product);

            // сигнализируем
            condition.signalAll();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock();
        }
    }
    public void put() {

        locker.lock();
        try{
            // пока на складе 3 товара, ждем освобождения места
            while (product>=3)
                condition.await();

            product++;
            System.out.println("Производитель добавил 1 товар");
            System.out.println("Товаров на складе: " + product);
            // сигнализируем
            condition.signalAll();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock();
        }
    }
}
// класс Производитель
class Producer implements Runnable{

    Store store;
    Producer(Store store){
        this.store=store;
    }
    public void run(){
        while (true){
            store.put();
        }
    }
}
// Класс Потребитель
class Consumer implements Runnable{

    Store store;
    Consumer(Store store){
        this.store=store;
    }
    public void run(){
        while (true){
            store.get();
        }
    }
}
