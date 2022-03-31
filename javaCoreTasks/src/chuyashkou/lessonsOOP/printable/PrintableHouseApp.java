package chuyashkou.lessonsOOP.printable;

public class PrintableHouseApp {

    public static void main(String[] args) {

        Printable book = new Book("War and peace");
        Printable magazine = new Magazine("Pravda");

        Printable[] printable = {book, magazine};

        for (Printable printable1 : printable) {
            printable1.print();
        }

        Magazine.printMagazines(printable);
        Book.printBooks(printable);
    }
}
