
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String userInput = scanner.nextLine();
        if (userInput.equals("n")) {
            double average = numbers.stream()
                    .mapToInt(number -> Integer.parseInt(number))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        } else if (userInput.equals("p")) {
            double average = numbers.stream()
                    .mapToInt(number -> Integer.parseInt(number))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
    }
}
