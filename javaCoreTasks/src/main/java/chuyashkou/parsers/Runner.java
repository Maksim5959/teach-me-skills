package chuyashkou.parsers;

import chuyashkou.parsers.jackson.JacksonParser;
import chuyashkou.parsers.jaxb.JaxbBookParser;
import chuyashkou.parsers.model.Book;
import chuyashkou.parsers.model.Library;
import chuyashkou.parsers.validator.XmlValidator;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Book book1 = new Book("War and peace", "123AABB",
                LocalDate.of(1950, 12, 12), new ArrayList<>());
        Book book2 = new Book("War and peace2", "333AABB",
                LocalDate.of(1951, 12, 12), Collections.singletonList(book1));
        Book book3 = new Book("War and peace3", "233AABB",
                LocalDate.of(1952, 12, 12), Arrays.asList(book1, book2));
        Book book4 = new Book("War and peace4", "433AABB",
                LocalDate.of(1953, 12, 12), Arrays.asList(book1, book2, book3));
        List<Book> books = new ArrayList<>(Arrays.asList(book1, book2, book3, book4));

        File xmlFile = new File("src/main/resources/files/book.xml");
        File xsdSchema = new File("src/main/resources/files/bookValidator.xsd");
        File jsonFile = new File("src/main/resources/files/book.json");

        JaxbBookParser.parseToXml(xmlFile, new Library(books));
        if (XmlValidator.validateXMLSchema(xsdSchema, xmlFile))
            System.out.println(JaxbBookParser.parseFromXml(xmlFile));

        JacksonParser<Book> bookJacksonParser = new JacksonParser<>();
        bookJacksonParser.parseToJson(jsonFile, books);
        System.out.println(bookJacksonParser.parseFromJson(jsonFile));
    }
}
