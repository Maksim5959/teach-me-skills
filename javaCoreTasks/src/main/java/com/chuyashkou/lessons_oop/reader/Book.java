package com.chuyashkou.lessons_oop.reader;

public class Book {

    String title;
    String authorName;

    public Book() {
    }

    public Book(String name, String authorName) {
        this.title = name;
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
