
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] inputArray = input.split(" ");
            String command = inputArray[0];
            int amount = Integer.parseInt(inputArray[1]);

            if (amount <= 0) {
                continue;
            }

            if (command.equals("add")) {
                if (first + amount <= 100) {
                    first += amount;
                } else {
                    first = 100;
                }
            }

            if (command.equals("move")) {

                int realAmount = 0;

                if (amount <= first) {
                    realAmount = amount;
                } else {
                    realAmount = first;
                }

                first -= realAmount;

                if (second + realAmount <= 100) {
                    second += realAmount;
                } else {
                    second = 100;
                }
            }

            if (command.equals("remove")) {
                if (amount >= second) {
                    second = 0;
                } else {
                    second -= amount;
                }
            }
        }
    }

}
