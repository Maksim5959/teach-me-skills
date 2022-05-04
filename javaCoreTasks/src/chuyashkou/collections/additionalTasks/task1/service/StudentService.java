package chuyashkou.collections.additionalTasks.task1.service;

import java.io.BufferedReader;

public interface StudentService {

    void getAllStudents();

    void addNewStudent(BufferedReader bufferedReader);

    void updateStudent(BufferedReader bufferedReader);

    void deleteStudent(BufferedReader bufferedReader);

    void getAllStudentsInFaculty(BufferedReader bufferedReader);

    void generateUniversity(String[] faculties, String[] names);

    void deleteAllStudents(BufferedReader bufferedReader);
}
