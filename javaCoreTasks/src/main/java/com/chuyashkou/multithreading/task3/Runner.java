package com.chuyashkou.multithreading.task3;

/*3. Вывод символа в трех потоках.
1.Создать класс расширяющий Thread.
2.Переопределить метод run() - здесь будет находиться синхронизированный блок кода.
3.Для того чтобы три объекта потока имели доступ к одному объекту, создаем конструктор принимающий на вход StringBuilder объект.
4.Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта 3.
5.Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз, а потом увеличьте значение символа на 1.
6.В методе main() создайте один объект класса StringBuilder, используя символ ‘a’.
7.Затем создайте три экземпляра объекта нашего класса и запустите потоки.*/

public class Runner {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("a");

        MyThread myThread1 = new MyThread(stringBuilder);
        MyThread myThread2 = new MyThread(stringBuilder);
        MyThread myThread3 = new MyThread(stringBuilder);

        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
