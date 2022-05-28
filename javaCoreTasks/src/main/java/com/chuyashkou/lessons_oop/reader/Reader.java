package com.chuyashkou.lessons_oop.reader;

public class Reader {

    private String fullName;
    private String faculty;
    private int libraryCardNumber;
    private long phoneNumber;
    private String birthday;

    public Reader() {
    }

    public Reader(String fullName, String faculty, int libraryCardNumber, long phoneNumber, String birthday) {
        this.fullName = fullName;
        this.faculty = faculty;
        this.libraryCardNumber = libraryCardNumber;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    public void takeBook(int booksCount) {
        System.out.println(this.fullName + " взял " + booksCount + " книг(и)");
    }

    public void takeBook(String... nameBooks) {
        System.out.println(this.fullName + " взял книги:");
        for (String name : nameBooks) {
            System.out.println(name);
        }
    }

    public void takeBook(Book... books) {
        System.out.println(this.fullName + " взял книги:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public void returnBook(int booksCount) {
        System.out.println(this.fullName + " вернул " + booksCount + " книг(и)");
    }

    public void returnBook(String... nameBooks) {
        System.out.println(this.fullName + " вернул книги:");
        for (String name : nameBooks) {
            System.out.println(name);
        }
    }

    public void returnBook(Book... books) {
        System.out.println(this.fullName + " вернул книги:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", libraryCardNumber=" + libraryCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
