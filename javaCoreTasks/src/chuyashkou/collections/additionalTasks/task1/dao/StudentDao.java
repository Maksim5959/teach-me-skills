package chuyashkou.collections.additionalTasks.task1.dao;

import chuyashkou.collections.additionalTasks.task1.model.Student;

import java.util.List;

public interface StudentDao {

  List<Student> getAllStudents ();

  void addAllStudents(List<Student> students);
}
