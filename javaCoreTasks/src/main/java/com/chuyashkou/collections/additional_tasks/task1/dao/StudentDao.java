package com.chuyashkou.collections.additional_tasks.task1.dao;

import com.chuyashkou.collections.additional_tasks.task1.model.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {

  Map<Long, Student> getAllStudents();

  Student addNewStudent(Student student);

  Student updateStudent(Student newStudent);

  Student deleteStudent(Long id);

  List<Student> getAllStudentsInFaculty(String faculty);
}
