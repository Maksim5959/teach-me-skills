package com.chuyashkou.stream_api.tms.model;

import java.util.Objects;

public class Hobby {

    private String name;
    private int mark;

    public Hobby() {
    }

    public Hobby(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobby hobby = (Hobby) o;
        return mark == hobby.mark && Objects.equals(name, hobby.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark);
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
