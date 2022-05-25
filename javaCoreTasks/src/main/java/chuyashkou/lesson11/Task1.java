package chuyashkou.lesson11;

/*1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
     последнего вхождения сивола(B).*/

import java.io.File;

public class Task1 {

    public static void main(String[] args) {

        char symbolA = 'e';
        char symbolB = 's';

        String text = TextReaderIO.readTextFromFileByBufferedReader(new File("files/fileTask1.txt"));

        if (text.indexOf(symbolA) > 0 && text.lastIndexOf(symbolB) > 0) {
            TextWriterIO.writeTextToFileByBufferedWriter(new File("files/fileTask1-1.txt"),
                    text.substring(text.indexOf(symbolA), text.lastIndexOf(symbolB) + 1));
        } else {
            System.out.println("Символы в тексте не найдены.");
        }
    }
}
