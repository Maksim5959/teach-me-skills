package com.chuyashkou.collections.additional_tasks.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class LongDataReader {

    public static Long read(File file) {
        long l = 0;
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file))) {
            l = dataInputStream.readLong();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return l;
    }
}
