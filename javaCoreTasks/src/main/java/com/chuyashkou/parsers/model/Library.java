package com.chuyashkou.parsers.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@XmlRootElement(name = "books")
@XmlAccessorType(XmlAccessType.FIELD)
public class Library {

    @XmlElement(name = "book")
    List<Book> bookList;
}
