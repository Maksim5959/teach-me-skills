package chuyashkou.lesson11;

/*5. Список каталога
Написать метод который циклически просматривает содержимое заданного каталога
и выводит на печать информацию о всех файлах и каталогах, находящихся в нем и в его подкаталогах.
Используем рекурсию.*/

import java.io.File;

public class Task8 {

    public static void main(String[] args) {

        TextWriterIO.writeTextToFileByBufferedWriter(new File("files/fileTask8.txt"),
                directoryInfo("C:\\TechMeSkills\\teach-me-skills\\javaCoreTasks\\src", "", new StringBuilder()));
    }

    private static String directoryInfo(String directoryName, String gap, StringBuilder result) {
        File file = new File(directoryName);

        if (file.isDirectory() && file.listFiles() != null) {
            for (File listFile : file.listFiles()) {
                result.append(gap).append(listFile.getName()).append("\n");
                directoryInfo(listFile.getAbsolutePath(), gap + "*",result);
            }
            result.append("\n");
        }
        return result.toString();
    }
}


