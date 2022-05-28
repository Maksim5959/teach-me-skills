package com.chuyashkou.collections.additional_tasks.task1.model;

import com.chuyashkou.collections.additional_tasks.io.LongDataReader;
import com.chuyashkou.collections.additional_tasks.io.LongDataWriter;

import java.io.File;
import java.util.Objects;

public class Student {

    private static final File ID_SAVE_FILE = new File("src/chuyashkou/collections/additionalTasks/task1/resources/id.bin");

    private long id;
    private String fullName;
    private int age;
    private String faculty;
    private int year;


    public Student() {
    }

    public Student(String fullName, int age,String faculty , int year) {
        this.fullName = fullName.toUpperCase();
        this.age = age;
        this.faculty = faculty.toUpperCase();
        this.year = year;
        this.id = readId();
        writeId(++this.id);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id
                && age == student.age
                && year == student.year && Objects.equals(fullName, student.fullName)
                && Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, age, faculty, year);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                ", year=" + year +
                '}';
    }

    private Long readId() {
        return LongDataReader.read(Student.ID_SAVE_FILE);
    }

    private void writeId(Long id) {
        LongDataWriter.write(id, Student.ID_SAVE_FILE);
    }
}
