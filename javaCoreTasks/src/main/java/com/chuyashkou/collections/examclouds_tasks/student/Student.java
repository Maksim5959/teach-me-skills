package com.chuyashkou.collections.examclouds_tasks.student;

import java.util.Objects;

public class Student implements Comparable <Student>{

    private String name;
    private String group;
    private int course;
    private int mathGrade;
    private int literatureGrade;
    private int englishLanguageGrade;
    private double gpa;

    public Student() {
    }

    public Student(String name, String group, int course, int mathGrade, int literatureGrade, int englishLanguageGrade)  {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mathGrade = mathGrade;
        this.literatureGrade = literatureGrade;
        this.englishLanguageGrade = englishLanguageGrade;
        this.gpa = (mathGrade + literatureGrade + englishLanguageGrade)/3.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
        this.gpa = (this.mathGrade + this.literatureGrade + this.englishLanguageGrade)/3.0;
    }

    public int getLiteratureGrade() {
        return literatureGrade;
    }

    public void setLiteratureGrade(int literatureGrade) {
        this.literatureGrade = literatureGrade;
        this.gpa = (this.mathGrade + this.literatureGrade + this.englishLanguageGrade)/3.0;
    }

    public int getEnglishLanguageGrade() {
        return englishLanguageGrade;
    }

    public void setEnglishLanguageGrade(int englishLanguageGrade) {
        this.englishLanguageGrade = englishLanguageGrade;
        this.gpa = (this.mathGrade + this.literatureGrade + this.englishLanguageGrade)/3.0;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && mathGrade == student.mathGrade && literatureGrade == student.literatureGrade && englishLanguageGrade == student.englishLanguageGrade && Double.compare(student.gpa, gpa) == 0 && Objects.equals(name, student.name) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, course, mathGrade, literatureGrade, englishLanguageGrade, gpa);
    }

    @Override
    public int compareTo(Student o) {
        int result;
        result = Double.compare(this.gpa,o.getGpa());
        if (result != 0) return result;
        result = this.group.compareTo(o.getGroup());
        if (result != 0) return result;
        result = Integer.compare(this.course,o.getCourse());
        if (result != 0) return result;
        result = Integer.compare(this.mathGrade,o.getMathGrade());
        if (result != 0) return result;
        result = Integer.compare(this.literatureGrade,o.getLiteratureGrade());
        if (result != 0) return result;
        result = Integer.compare(this.englishLanguageGrade,o.getEnglishLanguageGrade());
        if (result != 0) return result;
        result = this.name.compareTo(o.getName());
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", mathGrade=" + mathGrade +
                ", literatureGrade=" + literatureGrade +
                ", englishLanguageGrade=" + englishLanguageGrade +
                ", gpa=" + gpa +
                '}';
    }
}
