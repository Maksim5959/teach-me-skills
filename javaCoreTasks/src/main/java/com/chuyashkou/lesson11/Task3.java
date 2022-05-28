package com.chuyashkou.lesson11;

/*3)В исходном файле находятся слова, каждое слово на новой стороке. После
    запуска программы должен создать файл, который будет содержать в себе
    только полиндромы*/

import java.io.File;

public class Task3 {

    public static void main(String[] args) {

        TextWriterIO.writeTextToFileByBufferedWriter(new File("files/fileTask3-1.txt"),
                TextHandler.getPalindrome(TextReaderIO.readTextFromFileByBufferedReader(new File("files/fileTask3.txt"))));
    }
}
