package chuyashkou.parsers.jaxb;

import chuyashkou.parsers.model.Library;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.*;

public final class JaxbBookParser {

    public static void parseToXml(File file, Library groupBooks) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            JAXBContext context = JAXBContext.newInstance(Library.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(groupBooks, bufferedWriter);
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Library parseFromXml(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            JAXBContext jaxbContext = JAXBContext.newInstance(Library.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (Library) jaxbUnmarshaller.unmarshal(bufferedReader);
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
        return new Library();
    }
}
