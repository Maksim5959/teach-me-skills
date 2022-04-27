package chuyashkou.lesson11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public final class TextReaderIO {

    public static String readTextFromFileByBufferedReader(File file) {
        String line;
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            line = reader.readLine();
            while (line != null) {
                result.append(line).append("\n");
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public static String readTextFromFileByFileReader(File file) {
        StringBuilder result = new StringBuilder();
        int symbol;
        try (FileReader reader = new FileReader(file)) {
            symbol = reader.read();
            while (symbol != -1) {
                result.append((char) symbol);
                symbol = reader.read();
            }
            return result.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String readTextFromFileByFileReader(File file, int leftIndex, int rightIndex) {
        StringBuilder result = new StringBuilder();
        if (leftIndex >= 0 && rightIndex >= 0 && rightIndex > leftIndex) {
            char[] chars = new char[rightIndex];
            try (FileReader reader = new FileReader(file)) {
                int length = reader.read(chars, leftIndex, rightIndex);
                for (int i = 0; i < length; i++) {
                    result.append(chars[i]);
                }
                return result.toString();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static byte[] readTextFromFileByFileInputStream(File file) {
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] bytes = fis.readAllBytes();
            if (bytes.length != 0) {
                return bytes;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Integer [] readIntValueFromFileByDataInputStream (File file){
        List<Integer> result = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            while (true){
                result.add(dis.readInt());
            }
        } catch (EOFException e){
        } catch (IOException e){
            e.printStackTrace();
        }
        return result.toArray(new Integer[0]);
    }
}
