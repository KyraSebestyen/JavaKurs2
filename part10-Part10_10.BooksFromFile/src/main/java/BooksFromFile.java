
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }


    public static List<Book> readBooks(String file) {

        List<Book> books = null;

        try {
            books = Files.lines(Paths.get(file))
                    .map(row -> {
                        String[] rowSplit = row.split(",");
                        return new Book(rowSplit[0], Integer.parseInt(rowSplit[1]), Integer.parseInt(rowSplit[2]), rowSplit[3]);
                    })
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }

//    public static List<Book> readBooks2(String file) {
//
//        List<String> titles = new ArrayList<>();
//        List<Integer> years = new ArrayList<>();
//        List<Integer> pages = new ArrayList<>();
//        List<String> authors = new ArrayList<>();
//        List<Book> books = new ArrayList<>();
//
//        try {
//            List<String> rows = Files.lines(Paths.get(file)).collect(Collectors.toList());
//
//            for (String row : rows) {
//                String[] rowSplit = row.split(",");
//                titles.add(rowSplit[0]);
//                years.add(Integer.parseInt(rowSplit[1]));
//                pages.add(Integer.parseInt(rowSplit[2]));
//                authors.add(rowSplit[3]);
//            }
//
//            for (int i = 0; i < rows.size(); i++) {
//                Book book = new Book(titles.get(i), years.get(i), pages.get(i), authors.get(i));
//                books.add(book);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return books;
//    }
}
