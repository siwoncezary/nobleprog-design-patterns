package flyweight;

import java.util.ArrayList;
import java.util.List;

public class BookFactory {
    public static List<Book> buildBooks(int start, int end, BookDetails details){
        List<Book> books = new ArrayList<>();
        for(int id = start; id <= end; id++){
            books.add(new Book(id, details));
        }
        return books;
    }
}
