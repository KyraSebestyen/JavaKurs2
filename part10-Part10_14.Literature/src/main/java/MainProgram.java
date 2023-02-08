
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while(true){
            System.out.println("Input the name of the book, empty stops:");
            String title = scanner.nextLine();
            if(title.equals("")){
                break;
            }
            System.out.println("Input the age recommendation:");
            int ageRecommendation = Integer.parseInt(scanner.nextLine());
            books.add(new Book(title, ageRecommendation));
        }

        System.out.println(books.size() + " books in total.\n\nBooks:");
        books.stream().sorted()
                .forEach(System.out::println);

    }

}
