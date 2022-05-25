package chuyashkou.collections.additionalTasks.io;

import java.io.BufferedReader;
import java.io.IOException;

public final class ConsoleReader {

    public static String read(BufferedReader bufferedReader) {
        String line = "";
        try {
            line = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
}
