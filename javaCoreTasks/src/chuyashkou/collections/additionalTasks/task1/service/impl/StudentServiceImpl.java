package chuyashkou.collections.additionalTasks.task1.service.impl;

import chuyashkou.collections.additionalTasks.task1.dao.impl.StudentDaoImpl;
import chuyashkou.collections.additionalTasks.task1.io.ConsoleReader;
import chuyashkou.collections.additionalTasks.task1.model.Faculty;
import chuyashkou.collections.additionalTasks.task1.model.Student;
import chuyashkou.collections.additionalTasks.task1.model.comparators.StudentsComparatorByAge;
import chuyashkou.collections.additionalTasks.task1.model.comparators.StudentsComparatorByName;
import chuyashkou.collections.additionalTasks.task1.service.StudentService;
import chuyashkou.lesson11.TextReaderIO;

import java.io.BufferedReader;
import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class StudentServiceImpl implements StudentService {

    private final StudentDaoImpl studentDao = new StudentDaoImpl();
    private final List<Student> students = studentDao.getAllStudents();
    private static final String PASSWORD = TextReaderIO.readIntValueFromFileByDataInputStream(
            new File("src/chuyashkou/collections/additionalTasks/task1/resources/password.bin"))[0].toString();

    @Override
    public void getAllStudents() {
        TreeSet<Student> studentsSet = new TreeSet<>(new StudentsComparatorByName().thenComparing(new StudentsComparatorByAge()));
        studentsSet.addAll(studentDao.getAllStudents());
        studentsSet.forEach(System.out::println);
    }

    @Override
    public void addNewStudent(BufferedReader bufferedReader) {
        System.out.println("Введите данные нового студента через ',': ФИО, возраст, факультет, курс");
        Student student = validateEnteredData(ConsoleReader.read(bufferedReader).split("[,]"));
        if (student != null && itsStudentClone(student)) {
            this.students.add(student);
            studentDao.addAllStudents(this.students);
            System.out.println("Студент добавлен.");
        }
    }

    @Override
    public void updateStudent(BufferedReader bufferedReader) {
        System.out.println("Введите id студента: ");
        int indexOldStudent;
        if ((indexOldStudent = searchStudentById(ConsoleReader.read(bufferedReader))) < 0) {
            System.out.println("Студента с таким id не существует");
            return;
        }
        System.out.println(this.students.get(indexOldStudent));
        System.out.println("Введите новые данные студента через ',': ФИО, возраст, факультет, курс");
        Student newStudent = validateEnteredData(ConsoleReader.read(bufferedReader).split("[,]"));
        if (newStudent != null && itsStudentClone(newStudent)) {
            newStudent.setId(this.students.get(indexOldStudent).getId());
            this.students.remove(indexOldStudent);
            this.students.add(newStudent);
            studentDao.addAllStudents(this.students);
            System.out.println("Студент обнавлен.");
        }
    }

    @Override
    public void deleteStudent(BufferedReader bufferedReader) {
        System.out.println("Введите id студента: ");
        int indexOldStudent;
        if ((indexOldStudent = searchStudentById(ConsoleReader.read(bufferedReader))) < 0) {
            System.out.println("Студента с таким id не существует");
            return;
        }
        this.students.remove(indexOldStudent);
        studentDao.addAllStudents(this.students);
        System.out.println("Студент удален.");
    }

    @Override
    public void getAllStudentsInFaculty(BufferedReader bufferedReader) {
        System.out.println("Введите название факультета: ");
        String faculty = ConsoleReader.read(bufferedReader);
        if (itsFaculty(faculty)) return;

        System.out.printf("На факультете %s обучаются:\n", faculty.toUpperCase());
        for (Student student : this.students) {
            if (faculty.equalsIgnoreCase(student.getFaculty())) {
                System.out.printf("[%s, возраст - %s]\n", student.getFullName(), student.getAge());
            }
        }
    }

    @Override
    public void generateUniversity(String[] faculties, String[] names) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            Student student = new Student(names[random.nextInt(20)].strip(), random.nextInt(5) + 18,
                    faculties[random.nextInt(5)].strip(), random.nextInt(5) + 1);
            if (itsStudentClone(student)) {
                this.students.add(student);
            }
        }
        studentDao.addAllStudents(this.students);
    }

    @Override
    public void deleteAllStudents(BufferedReader bufferedReader) {
        System.out.println("Введите пароль: ");
        if (passwordValidation(ConsoleReader.read(bufferedReader))) {
            this.students.clear();
            studentDao.addAllStudents(students);
            System.out.println("Все студенты удалены. ");
        }
    }

    private int searchStudentById(String strId) {
        try {
            long id = Long.parseLong(strId);
            for (int i = 0; i < this.students.size(); i++) {
                if (students.get(i).getId() == id) return i;
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат ввода.");
            return -1;
        }
        return -1;
    }

    private boolean itsStudentClone(Student student) {
        for (Student std : this.students) {
            if (std.equals(student)) {
                System.out.printf("Такой студент уже существует, id: %s.\n", std.getId());
                return false;
            }
        }
        return true;
    }

    private boolean itsFaculty(String facultyStr) {
        for (Faculty faculty : Faculty.values()) {
            if (faculty.getName().equalsIgnoreCase(facultyStr)) return false;
        }
        System.out.println("Неверно введен факультет.");
        return true;
    }

    private Student validateEnteredData(String[] data) {
        try {
            if (data.length != 4) {
                System.out.println("Неверный формат ввода данных.");
                return null;
            } else if (Integer.parseInt(data[3].strip()) < 1 || Integer.parseInt(data[3].strip()) > 5) {
                System.out.println("Неверно введен курс студента.");
                return null;
            } else if (Integer.parseInt(data[1].strip()) < 17) {
                System.out.println("Неверно введен возраст студента.");
                return null;
            } else if (itsFaculty(data[2].strip())) {
                return null;
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат ввода данных.");
            return null;
        }
        return new Student(data[0].strip(), Integer.parseInt(data[1].strip()), data[2].strip(), Integer.parseInt(data[3].strip()));
    }

    private boolean passwordValidation(String password) {
        if (password.equals(PASSWORD)) {
            return true;
        } else {
            System.out.println("Пароль введен неверно.");
            return false;
        }
    }
}
