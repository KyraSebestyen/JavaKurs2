
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input > 0) {
                sum += input;
                count++;
            }
        }

        if (sum == 0 || count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1. * sum / count);
        }

    }
}
