package chuyashkou.collections.additionalTasks.task1.controller;

import chuyashkou.collections.additionalTasks.task1.io.ConsoleReader;
import chuyashkou.collections.additionalTasks.task1.service.StudentService;
import chuyashkou.collections.additionalTasks.task1.service.impl.StudentServiceImpl;
import chuyashkou.lesson11.TextReaderIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class StudentController {

    private final StudentService studentService = new StudentServiceImpl();

    public void run() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            boolean stop = true;

            while (stop) {
                System.out.println("Выберите действие: ");
                System.out.println("1. Выход;");
                System.out.println("2. Получить всех студентов;");
                System.out.println("3. Добавить нового студента;");
                System.out.println("4. Отредактировать студента");
                System.out.println("5. Удалить студента.");
                System.out.println("6. Получить всех студентов на факультете.");
                System.out.println("7. Сгенерировать университет.");
                System.out.println("8. Удалить всех студентов.");
                String choice = ConsoleReader.read(bufferedReader);

                switch (choice) {
                    case "1" -> stop = false;
                    case "2" -> getAllStudents();
                    case "3" -> addNewStudent(bufferedReader);
                    case "4" -> updateStudent(bufferedReader);
                    case "5" -> deleteStudent(bufferedReader);
                    case "6" -> getAllStudentsInFaculty(bufferedReader);
                    case "7" -> generateUniversity();
                    case "8" -> deleteAllStudents (bufferedReader);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteAllStudents(BufferedReader bufferedReader) {
        studentService.deleteAllStudents(bufferedReader);
    }

    private void getAllStudentsInFaculty(BufferedReader bufferedReader) {
        studentService.getAllStudentsInFaculty(bufferedReader);
    }

    private void deleteStudent(BufferedReader bufferedReader) {
        studentService.deleteStudent(bufferedReader);
    }

    private void getAllStudents() {
        studentService.getAllStudents();
    }

    private void addNewStudent(BufferedReader bufferedReader) {
        studentService.addNewStudent(bufferedReader);
    }

    private void updateStudent(BufferedReader bufferedReader) {
        studentService.updateStudent(bufferedReader);
    }

    private void generateUniversity() {
        Random random = new Random();
        String[] faculties = TextReaderIO.readTextFromFileByBufferedReader(
                new File("src/chuyashkou/collections/additionalTasks/task1/resources/faculties.txt")).split("[,]");
        String[] names = TextReaderIO.readTextFromFileByBufferedReader(
                new File("src/chuyashkou/collections/additionalTasks/task1/resources/names.txt")).split("[,]");
        studentService.generateUniversity (faculties, names);
    }
}
