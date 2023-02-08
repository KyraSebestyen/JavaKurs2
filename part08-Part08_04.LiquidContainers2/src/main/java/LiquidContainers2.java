
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inputArray = input.split(" ");
            String command = inputArray[0];
            int amount = Integer.parseInt(inputArray[1]);

            if (command.equals("add")) {
                first.add(amount);
                continue;
            }

            if (command.equals("remove")) {
                second.remove(amount);
                continue;
            }

            if (command.equals("move")) {
                if (amount >= first.contains()) {
                    second.add(first.contains());
                    first.remove(amount);
                } else {
                    first.remove(amount);
                    second.add(amount);
                }
            }

        }
    }

}
