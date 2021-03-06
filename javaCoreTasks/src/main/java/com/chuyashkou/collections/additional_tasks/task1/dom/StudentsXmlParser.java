package com.chuyashkou.collections.additional_tasks.task1.dom;

import com.chuyashkou.collections.additional_tasks.task1.model.Student;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class StudentsXmlParser {

    public static Map<Long, Student> parseStudentsXml() {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Map<Long, Student> students = new HashMap<>();
        Document document = null;

        try {
            document = dbf.newDocumentBuilder().parse(
                    new File("src/main/java/chuyashkou/collections/additionalTasks/task1/resources/students.xml"));
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }

        assert document != null;
        Node root = document.getFirstChild();
        NodeList nodeList = root.getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Student student = new Student();
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                NamedNodeMap attributes = nodeList.item(i).getAttributes();
                for (int j = 0; j < attributes.getLength(); j++) {
                    switch (attributes.item(j).getNodeName()) {
                        case "age" -> student.setAge(Integer.parseInt(attributes.item(j).getTextContent()));
                        case "fullName" -> student.setFullName(attributes.item(j).getTextContent());
                        case "faculty" -> student.setFaculty(attributes.item(j).getTextContent());
                        case "id" -> student.setId(Long.parseLong(attributes.item(j).getTextContent()));
                        case "year" -> student.setYear(Integer.parseInt(attributes.item(j).getTextContent()));
                    }
                }
                students.put(student.getId(), student);
            }
        }
        return students;
    }
}
