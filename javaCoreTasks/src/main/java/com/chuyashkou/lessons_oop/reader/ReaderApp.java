package com.chuyashkou.lessons_oop.reader;

import java.util.Random;

public class ReaderApp {

    public static void main(String[] args) {

        Random random = new Random();
        Reader[] readers = new Reader[random.nextInt(100) + 1];
        Book[] books = new Book[readers.length];

        for (int i = 1; i < readers.length; i++) {
            readers[i] = new Reader("Firstname" + i + " Lastname" + i + " Patronymic" + i, "Faculty"
                    + i, i, 375447897679L + i, (random.nextInt(28) + 1) + "."
                    + (random.nextInt(12) + 1) + ".199" + random.nextInt(10));

            books[i] = new Book("Title" + i, "Author" + i);

            if (random.nextInt(100) > 50) {
                readers[i].takeBook(i);
                readers[i].takeBook(books[i].getTitle());
                readers[i].takeBook(books[i]);
            } else {
                readers[i].returnBook(i);
                readers[i].returnBook(books[i].getTitle());
                readers[i].returnBook(books[i]);
            }
        }
    }
}
