package chuyashkou.parsers.jaxb;

import chuyashkou.parsers.model.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public final class JaxbBookParser {

    public static void parseToXml(File file, Book book) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            JAXBContext context = JAXBContext.newInstance(Book.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(book, bufferedWriter);
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }
}
