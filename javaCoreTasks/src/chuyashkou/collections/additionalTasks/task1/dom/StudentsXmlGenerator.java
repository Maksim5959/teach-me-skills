package chuyashkou.collections.additionalTasks.task1.dom;

import chuyashkou.collections.additionalTasks.task1.model.Student;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public final class StudentsXmlGenerator {

    public static void generateStudentsXml(List<Student> students) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                new FileOutputStream("src/chuyashkou/collections/additionalTasks/task1/resources/students.xml"))) {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document document = builder.newDocument();
            Element root = document.createElement("students");
            document.appendChild(root);

            for (Student student : students) {
                if (student != null && student.getAge() != 0) {
                    Element inner = document.createElement("student");
                    inner.setAttribute("id", String.format("%s", student.getId()));
                    inner.setAttribute("fullName", student.getFullName());
                    inner.setAttribute("age", String.format("%s", student.getAge()));
                    inner.setAttribute("faculty", student.getFaculty());
                    inner.setAttribute("year", String.format("%s", student.getYear()));
                    root.appendChild(inner);
                }
            }

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(new DOMSource(document), new StreamResult(bufferedOutputStream));

        } catch (ParserConfigurationException | TransformerException | IOException e) {
            e.printStackTrace();
        }
    }
}
