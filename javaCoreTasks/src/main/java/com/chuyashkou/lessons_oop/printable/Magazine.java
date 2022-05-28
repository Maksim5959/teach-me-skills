package com.chuyashkou.lessons_oop.printable;

public class Magazine implements Printable {

    private String name;

    public Magazine() {
    }

    public Magazine(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable printable1 : printable) {
            if (printable1 instanceof Magazine) System.out.println(printable1);
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
