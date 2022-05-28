package com.chuyashkou.collections.additional_tasks.io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class LongDataWriter {

    public static void write(Long l, File file) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file))) {
            dataOutputStream.writeLong(l);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
