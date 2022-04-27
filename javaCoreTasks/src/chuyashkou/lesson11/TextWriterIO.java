package chuyashkou.lesson11;

import java.io.*;

public final class TextWriterIO {

    public static void writeTextToFileByBufferedWriter(File file, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeTextToFileByBufferedWriter(String fileName, String text, boolean append) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, append))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeTextToFileByFileWriter(File file, String text) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeTextToFileByFileWriter(File file, String text, int leftIndex, int rightIndex) {
        if (leftIndex >= 0 && rightIndex >= 0 && rightIndex > leftIndex && rightIndex <= text.length() - 1) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(text, leftIndex, rightIndex);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeTextToFileByFileOutputStream(File file, byte[] bytes) {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeTextToFileByPrintWriter(String fileName, String text, Object... objects) {
        try (PrintWriter printStream = new PrintWriter(new FileWriter(fileName, true))) {
            printStream.printf(text, objects);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeIntToFileByDataOutputStream(File file, int[] values) {
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            for (int value : values) {
                dos.writeInt(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
