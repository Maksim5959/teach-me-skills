package chuyashkou.collections.additionalTasks.task1.dao.impl;

import chuyashkou.collections.additionalTasks.task1.dao.StudentDao;
import chuyashkou.collections.additionalTasks.task1.dom.StudentsXmlGenerator;
import chuyashkou.collections.additionalTasks.task1.dom.StudentsXmlParser;
import chuyashkou.collections.additionalTasks.task1.model.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> getAllStudents() {
        return StudentsXmlParser.parseStudentsXml();
    }

    @Override
    public void addAllStudents(List<Student> students) {
        StudentsXmlGenerator.generateStudentsXml(students);
    }
}
