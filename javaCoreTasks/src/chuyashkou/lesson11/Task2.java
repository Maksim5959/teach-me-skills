package chuyashkou.lesson11;

//2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в позиции 0

import java.io.File;

public class Task2 {

    public static void main(String[] args) {

        String text = TextReaderIO.readTextFromFileByBufferedReader(new File("files/fileTask1.txt"));

        TextWriterIO.writeTextToFileByBufferedWriter(new File("files/fileTask2.txt")
                , text.replace(text.charAt(3), text.charAt(0)));
    }
}
