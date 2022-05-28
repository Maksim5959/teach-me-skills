package com.chuyashkou.lessons_oop.printable;

public class Book implements Printable {

    private String name;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public static void printBooks(Printable[] printable) {
        for (Printable printable1 : printable) {
            if (printable1 instanceof Book) System.out.println(printable1);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }

    @Override
    public String toString() {
        return "" + name;
    }
}
