
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> userInput = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            userInput.add(input);
        }

        userInput.forEach(System.out::println);

    }
}
