package com.chuyashkou.parsers.model;

import com.chuyashkou.parsers.jaxb.LocalDateAdapter;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"title","vendorCode","publishingDate","relatedBooks"})
public class Book {

    @XmlAttribute
    private String title;
    @XmlAttribute
    private String vendorCode;
    @XmlAttribute
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class, type = LocalDate.class)
    private LocalDate publishingDate;
    @XmlElementWrapper(nillable = true, name = "relatedBooks")
    @XmlElement(name = "relatedBook")
    private List<Book> relatedBooks;
}
