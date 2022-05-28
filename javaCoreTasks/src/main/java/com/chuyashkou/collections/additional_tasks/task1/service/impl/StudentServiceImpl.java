package com.chuyashkou.collections.additional_tasks.task1.service.impl;

import com.chuyashkou.collections.additional_tasks.task1.dao.impl.StudentDaoImpl;
import com.chuyashkou.collections.additional_tasks.task1.model.Faculty;
import com.chuyashkou.collections.additional_tasks.task1.model.Student;
import com.chuyashkou.collections.additional_tasks.task1.service.StudentService;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class StudentServiceImpl implements StudentService {

    private static final String REGEX_BY_STUDENTS_YEAR_VALIDATIONS = "[1-5]";
    private static final String REGEX_BY_NAME_VALIDATIONS = "([А-Яа-яA-Za-z]+[\\s]){2}[А-Яа-яA-Za-z]+";
    private static final String REGEX_BY_AGE_VALIDATIONS = "([1][7-9]|[2][\\d]|[3][\\d])";
    private static final String REGEX_BY_ID_VALIDATIONS = "[\\d]+";

    private final StudentDaoImpl studentDao = new StudentDaoImpl();

    @Override
    public void getAllStudentsByName() {
        TreeSet<Student> studentsSet = new TreeSet<>(Comparator.comparing(Student::getFullName).thenComparing(Student::getId));
        studentsSet.addAll(studentDao.getAllStudents().values());
        studentsSet.forEach(System.out::println);
    }

    @Override
    public void getAllStudentsByAge() {
        TreeSet<Student> studentsSet = new TreeSet<>(Comparator.comparing(Student::getAge).thenComparing(Student::getId));
        studentsSet.addAll(studentDao.getAllStudents().values());
        studentsSet.forEach(System.out::println);
    }

    @Override
    public void addNewStudent(String[] studentFields) {
        if (isInvalidEnterFormat(studentFields) || isInvalidName(studentFields[0]) || isInvalidAge(studentFields[1])
                || isInvalidFaculty(studentFields[2]) || isInvalidYear(studentFields[3])) {
            return;
        }
        Student student = parseStudent(studentFields);
        if (isCloneStudent(Long.toString(student.getId()))) {
            System.out.println("Такой студент уже существует.");
            return;
        }
        if (studentDao.addNewStudent(student) == null) System.out.println("Студент добавлен.");
        else System.out.println("Студент не добавлен.");
    }


    @Override
    public void updateStudent(String id, String[] studentFields) {
        if (isInvalidId(id) || isInvalidEnterFormat(studentFields) || isInvalidName(studentFields[0])
                || isInvalidAge(studentFields[1]) || isInvalidFaculty(studentFields[2]) || isInvalidYear(studentFields[3])) {
            return;
        } else if (!isCloneStudent(id)) {
            System.out.printf("Студент с ID - %s не найден.\n", id.strip());
            return;
        }
        Student newStudent = parseStudent(studentFields);
        newStudent.setId(Long.parseLong(id.strip()));
        Student oldStudent = studentDao.updateStudent(newStudent);
        if (oldStudent != null)
            System.out.printf("Студент %s отредактирован, обновленный студент - %s.\n", oldStudent, newStudent);
        else System.out.println("Студент не отредактирован.");
    }

    @Override
    public void deleteStudent(String id) {
        if (isInvalidId(id)) {
            return;
        } else if (!isCloneStudent(id)) {
            System.out.printf("Студент с ID - %s не найден.\n", id.strip());
            return;
        }
        Student student = studentDao.deleteStudent(Long.parseLong(id.strip()));
        System.out.printf("Студент - %s удален.\n", student);
    }

    @Override
    public void getAllStudentsInFaculty(String faculty) {
        if (isInvalidFaculty(faculty)) {
            return;
        }
        List<Student> studentsInFaculty = studentDao.getAllStudentsInFaculty(faculty);
        if (studentsInFaculty.isEmpty()) {
            System.out.printf("На факультете %s нет студентов", faculty.strip().toUpperCase());
        } else {
            System.out.printf("На факультете %s обучаются:\n", faculty.toUpperCase());
            for (Student student : studentsInFaculty) {
                System.out.println(student);
            }
        }
    }

    @Override
    public void generateUniversity(String[] faculties, String[] names) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            Student student = new Student(names[random.nextInt(20)].strip(), random.nextInt(5) + 18,
                    faculties[random.nextInt(5)].strip(), random.nextInt(5) + 1);
            studentDao.addNewStudent(student);
        }
    }

    private boolean isCloneStudent(String id) {
        return studentDao.getAllStudents().containsKey(Long.parseLong(id.strip()));
    }

    private boolean isInvalidEnterFormat(String[] studentFields) {
        if (studentFields.length != 4) {
            System.out.println("Неверный формат ввода.");
            return true;
        }
        return false;
    }

    private boolean isInvalidId(String id) {
        if (!id.strip().matches(REGEX_BY_ID_VALIDATIONS)) {
            System.out.println("ID введен неверно.");
            return true;
        }
        return false;
    }

    private boolean isInvalidFaculty(String facultyStr) {
        for (Faculty faculty : Faculty.values()) {
            if (faculty.getName().equalsIgnoreCase(facultyStr.strip()))
                return false;
        }
        System.out.println("Неверно введен факультет.");
        return true;
    }

    private boolean isInvalidYear(String year) {
        if (!year.strip().matches(REGEX_BY_STUDENTS_YEAR_VALIDATIONS)) {
            System.out.println("Неверно введен курс студента.");
            return true;
        }
        return false;
    }

    private boolean isInvalidAge(String age) {
        if (!age.strip().matches(REGEX_BY_AGE_VALIDATIONS)) {
            System.out.println("Неверно введен возраст студента.");
            return true;
        }
        return false;
    }

    private boolean isInvalidName(String name) {
        if (!name.strip().matches(REGEX_BY_NAME_VALIDATIONS)) {
            System.out.println("Неверно введено имя студента, введите имя в формате (Фамилия Имя Отчество).");
            return true;
        }
        return false;
    }

    private Student parseStudent(String[] studentFields) {
        String fullName = studentFields[0].strip();
        int age = Integer.parseInt(studentFields[1].strip());
        String faculty = studentFields[2].strip();
        int year = Integer.parseInt(studentFields[3].strip());
        return new Student(fullName, age, faculty, year);
    }
}
