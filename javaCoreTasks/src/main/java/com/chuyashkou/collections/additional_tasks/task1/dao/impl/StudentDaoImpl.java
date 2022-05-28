package com.chuyashkou.collections.additional_tasks.task1.dao.impl;

import com.chuyashkou.collections.additional_tasks.task1.dao.StudentDao;
import com.chuyashkou.collections.additional_tasks.task1.dom.StudentsXmlGenerator;
import com.chuyashkou.collections.additional_tasks.task1.dom.StudentsXmlParser;
import com.chuyashkou.collections.additional_tasks.task1.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentDaoImpl implements StudentDao {

    private final Map<Long, Student> students = StudentsXmlParser.parseStudentsXml();

    @Override
    public Map<Long, Student> getAllStudents() {
        return this.students;
    }

    @Override
    public Student addNewStudent(Student student) {
        Student putStudent = this.students.put(student.getId(), student);
        if (putStudent == null) StudentsXmlGenerator.generateStudentsXml(this.students);
        return putStudent;
    }

    @Override
    public Student updateStudent(Student newStudent) {
        Student oldStudent = this.students.put(newStudent.getId(), newStudent);
        if (oldStudent != null) StudentsXmlGenerator.generateStudentsXml(this.students);
        return oldStudent;
    }

    @Override
    public Student deleteStudent(Long id) {
        Student student = students.remove(id);
        if (student != null) StudentsXmlGenerator.generateStudentsXml(this.students);
        return student;
    }

    @Override
    public List<Student> getAllStudentsInFaculty(String faculty) {
        List<Student> result = new ArrayList<>();
        for (Student student : this.students.values()) {
            if (student.getFaculty().equalsIgnoreCase(faculty)) {
                result.add(student);
            }
        }
        return result;
    }
}
