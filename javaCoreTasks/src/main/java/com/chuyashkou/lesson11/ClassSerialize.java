package com.chuyashkou.lesson11;

import java.io.*;

public final class ClassSerialize {

    public static <T> void serialize(File file, T object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object deserialize(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
