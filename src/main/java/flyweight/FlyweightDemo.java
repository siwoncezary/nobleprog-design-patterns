package flyweight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class FlyweightDemo {
    public static void main(String[] args) {
        List<Book> books = BookFactory.buildBooks(
                10,
                23,
                new BookDetails("Java", "Schildt")
        );
        System.out.println(books);
        //zmiana współdzielonego stanu powoduje zmianę we wszystkich pyłkach
        books.get(11).getDetails().setTitle("Nowy tytuł");
        System.out.println(books);
        String sourcePath = "aa.txt";
        String targetPath = "bb.txt";
        try {
            Files.copy(Path.of(sourcePath),Path.of(targetPath), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            ;
        }
    }
}
