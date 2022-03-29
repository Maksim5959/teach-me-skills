package chuyashkou.lessonsOOP.reader;

public class Reader {

    private String firstname;

    private String lastname;

    private String patronymic;

    private String faculty;

    private int libraryCardNumber;

    private long phoneNumber;

    private String birthday;

    public Reader() {
    }

    public Reader(String firstname, String lastname, String patronymic, String faculty, int libraryCardNumber, long phoneNumber, String birthday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.faculty = faculty;
        this.libraryCardNumber = libraryCardNumber;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    public void takeBook(int booksCount) {
        System.out.println(this.lastname + " " + this.firstname + " " + this.patronymic + " взял " + booksCount + " книг(и)");
    }

    public void takeBook(String... nameBooks) {
        System.out.println(this.lastname + " " + this.firstname + " " + this.patronymic + " взял книги:");
        for (String name : nameBooks) {
            System.out.println(name);
        }
    }

    public void takeBook(Book... books) {
        System.out.println(this.lastname + " " + this.firstname + " " + this.patronymic + " взял книги:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public void returnBook(int booksCount) {
        System.out.println(this.lastname + " " + this.firstname + " " + this.patronymic + " вернул " + booksCount + " книг(и)");
    }

    public void returnBook(String... nameBooks) {
        System.out.println(this.lastname + " " + this.firstname + " " + this.patronymic + " вернул книги:");
        for (String name : nameBooks) {
            System.out.println(name);
        }
    }

    public void returnBook(Book... books) {
        System.out.println(this.lastname + " " + this.firstname + " " + this.patronymic + " вернул книги:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", faculty='" + faculty + '\'' +
                ", libraryCardNumber=" + libraryCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
