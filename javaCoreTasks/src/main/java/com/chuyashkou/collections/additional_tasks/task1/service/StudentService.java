package com.chuyashkou.collections.additional_tasks.task1.service;

public interface StudentService {

    void getAllStudentsByName();

    void getAllStudentsByAge();

    void addNewStudent(String[] studentFields);

    void updateStudent(String id, String[] studentFields);

    void deleteStudent(String id);

    void getAllStudentsInFaculty(String faculty);

    void generateUniversity(String[] faculties, String[] names);
}
