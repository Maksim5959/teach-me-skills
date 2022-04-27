package chuyashkou.lesson11;

import java.io.File;

public final class FileRecorder {

    public static void copyFile (File firstFile, File secondFile) {
        TextWriterIO.writeTextToFileByBufferedWriter(secondFile, TextReaderIO.readTextFromFileByBufferedReader(firstFile));
    }
}
