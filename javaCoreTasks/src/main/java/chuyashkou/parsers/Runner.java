package chuyashkou.parsers;

import chuyashkou.parsers.jaxb.JaxbBookParser;
import chuyashkou.parsers.model.Book;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Book book = new Book("War and peace", "123AABB",
                LocalDate.of(1950,12,12),new ArrayList<>());
        JaxbBookParser.parseToXml(new File("src/main/resources/files/book.xml"), book);
    }
}
