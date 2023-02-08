import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {

    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> Literacy.createFromLine(line))
                    .sorted()
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
