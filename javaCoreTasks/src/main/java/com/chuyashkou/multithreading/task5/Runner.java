package com.chuyashkou.multithreading.task5;

/*5. Запись массивов чисел в файлы в разных потоках. Реализация интерфейса Runnable
Условие задачи. Заданы три целочисленных массива.
Записать эти массивы в файл в паралельних потоках.
Создать класс SaveAsThread для представления потока, который записывает целочисленный массив в файл.*/

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException, InterruptedException {

        String path = "src/main/resources/files/multithreading.txt";

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] array3 = {11, 12, 13, 14, 15};

        Thread thread1 = new SaveAsThread(array1,path);
        Thread thread2 = new SaveAsThread(array2,path);
        Thread thread3 = new SaveAsThread(array3,path);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
