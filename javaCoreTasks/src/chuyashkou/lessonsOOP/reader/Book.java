package chuyashkou.lessonsOOP.reader;

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
}
