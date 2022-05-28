package com.chuyashkou.lesson11;

/*6. Копирование файла в другой файл
Написать класс, который копирует содержимое из одного файла в другой.
Используем классы BufferedReader, FileReader, BufferedWriter, FileWriter.*/

import java.io.File;

public class Task6 {

    public static void main(String[] args) {

        FileRecorder.copyFile(new File("files/fileTask6.txt"),new File("files/fileTask6-1.txt"));
    }
}
