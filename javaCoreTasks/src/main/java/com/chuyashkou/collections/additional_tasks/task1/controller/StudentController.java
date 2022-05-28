package com.chuyashkou.collections.additional_tasks.task1.controller;

import com.chuyashkou.collections.additional_tasks.io.ConsoleReader;
import com.chuyashkou.collections.additional_tasks.task1.service.StudentService;
import com.chuyashkou.collections.additional_tasks.task1.service.impl.StudentServiceImpl;
import com.chuyashkou.lesson11.TextReaderIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentController {

    private static final File STUDENTS_NAMES_FILE = new File("src/chuyashkou/collections/additionalTasks/task1/resources/names.txt");
    private static final File STUDENTS_FACULTIES_FILE = new File("src/chuyashkou/collections/additionalTasks/task1/resources/faculties.txt");
    private static final String FORMATTING_REGEX = "[,]";

    private final StudentService studentService = new StudentServiceImpl();

    public void run() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            boolean stop = true;
            while (stop) {
                System.out.println("Выберите действие: ");
                System.out.println("1. Выход");
                System.out.println("2. Получить всех студентов");
                System.out.println("3. Добавить нового студента");
                System.out.println("4. Отредактировать студента");
                System.out.println("5. Удалить студента");
                System.out.println("6. Получить всех студентов на факультете");
                System.out.println("7. Сгенерировать университет");
                String choice = ConsoleReader.read(bufferedReader);

                switch (choice) {
                    case "1" -> stop = false;
                    case "2" -> getAllStudents(bufferedReader);
                    case "3" -> addNewStudent(bufferedReader);
                    case "4" -> updateStudent(bufferedReader);
                    case "5" -> deleteStudent(bufferedReader);
                    case "6" -> getAllStudentsInFaculty(bufferedReader);
                    case "7" -> generateUniversity();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getAllStudentsInFaculty(BufferedReader bufferedReader) {
        System.out.println("Введите название факультета: ");
        studentService.getAllStudentsInFaculty(ConsoleReader.read(bufferedReader));
    }

    private void deleteStudent(BufferedReader bufferedReader) {
        System.out.println("Введите ID студента");
        studentService.deleteStudent(ConsoleReader.read(bufferedReader));
    }

    private void getAllStudents(BufferedReader bufferedReader) {
        boolean stop = true;
        while (stop) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Выход");
            System.out.println("2. Получить всех студентов по имени (в алфавитном порядке)");
            System.out.println("3. Получить всех студентов по возрасту (возрастание)");
            String choice = ConsoleReader.read(bufferedReader);

            switch (choice) {
                case "1" -> stop = false;
                case "2" -> studentService.getAllStudentsByName();
                case "3" -> studentService.getAllStudentsByAge();
            }
        }
    }

    private void addNewStudent(BufferedReader bufferedReader) {
        System.out.println("Введите данные нового студента через ',': ФИО, возраст, факультет, курс");
        studentService.addNewStudent(ConsoleReader.read(bufferedReader).split(FORMATTING_REGEX));
    }

    private void updateStudent(BufferedReader bufferedReader) {
        System.out.println("Введите ID студента");
        String id = ConsoleReader.read(bufferedReader);
        System.out.println("Введите новые данные студента через ',': ФИО, возраст, факультет, курс");
        studentService.updateStudent(id, ConsoleReader.read(bufferedReader).split(FORMATTING_REGEX));
    }

    private void generateUniversity() {
        String[] faculties = TextReaderIO.readTextFromFileByBufferedReader(STUDENTS_FACULTIES_FILE).split(FORMATTING_REGEX);
        String[] names = TextReaderIO.readTextFromFileByBufferedReader(STUDENTS_NAMES_FILE).split(FORMATTING_REGEX);
        studentService.generateUniversity(faculties, names);
    }
}
