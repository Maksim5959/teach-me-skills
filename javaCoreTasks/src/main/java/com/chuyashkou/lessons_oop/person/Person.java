package com.chuyashkou.lessons_oop.person;

public class Person {

    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println(this.fullName + ", " + age + " лет " + " говорит.");
    }

    public void talk() {
        System.out.println(this.fullName + ", " + age + " лет " + " говорит.");
    }
}
