package com.chuyashkou.lesson_string.task6;

import com.chuyashkou.lesson11.TextWriterIO;

import java.util.Date;

public class Employee {

    private String fullName;
    private double salary;

    public Employee() {
    }

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addReportToFile(String fileName) {
        Date date = new Date();
        TextWriterIO.writeTextToFileByPrintWriter(fileName, "%-30s%-20s got %15.2f dollars.\n",date, this.getFullName(), this.getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
