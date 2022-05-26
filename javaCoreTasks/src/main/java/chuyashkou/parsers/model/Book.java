package chuyashkou.parsers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@XmlType(name = "book")
public class Book {

    private String title;
    private String vendorCode;
    private LocalDate publishingDate;
    private List<Book> relatedBooks;
}
