package flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class BookDetails{
    private String title;
    private String author;
}

@Data
@AllArgsConstructor
public class Book {
    private int bookId;
    private BookDetails details;
}
