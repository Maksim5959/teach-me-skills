package com.chuyashkou.collections.examclouds_tasks;

/*8. Добавить студентов в коллекцию
Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
Создать коллекцию, содержащую объекты класса Student.
Написать метод, который удаляет студентов со средним баллом <3.
Если средний балл>=3, студент переводится на следующий курс.
Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.*/

import com.chuyashkou.collections.examclouds_tasks.student.Student;

import java.util.*;

public class Task8 {

    public static void main(String[] args) {

        List<Student> students = createStudentsSet();
        printStudents(students, 5);
        removeStudentByGPA(students);
        printStudents(students, 5);
    }

    private static void printStudents(List<Student> students, int course) {
        Map<Student, Integer> studentsByCourse = new HashMap<>();
        Set<String> oneCourseStudents = new TreeSet<>();

        for (Student student : students) {
            studentsByCourse.put(student, student.getCourse());
        }

        for (Map.Entry<Student, Integer> studentIntegerEntry : studentsByCourse.entrySet()) {
            if (studentIntegerEntry.getValue() == course) oneCourseStudents.add(studentIntegerEntry.getKey().getName());
        }
        System.out.printf("Names of students %d course: %s\n", course, oneCourseStudents);
    }

    private static void removeStudentByGPA(List<Student> students) {
        List<Student> removeStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getGpa() < 3) {
                removeStudents.add(student);
            } else if (student.getGpa() >= 3 && student.getCourse() < 5) {
                student.setCourse(student.getCourse() + 1);
            }
        }
        students.removeAll(removeStudents);
    }

    private static List<Student> createStudentsSet() {
        Random random = new Random();
        List<Student> students = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            students.add(new Student(String.format("Ivan %d", i), "C" + random.nextInt(100),
                    random.nextInt(6) + 1, random.nextInt(6) + 1,
                    random.nextInt(6) + 1, random.nextInt(6) + 1));
        }
        return students;
    }
}
