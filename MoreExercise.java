import java.util.Scanner;

public class MoreExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        double totalSpend = 0.0;
        while (!input.equals("Game Time")) {
            switch (input) {
                case "OutFall 4":
                    if (currentBalance >= 39.99) {
                        System.out.printf("Bought OutFall 4%n");
                        currentBalance = currentBalance - 39.99;
                        totalSpend = totalSpend + 39.99;
                    } else {
                        System.out.printf("Too Expensive%n");
                    }
                    break;
                case "CS: OG":
                    if (currentBalance >= 15.99) {
                        System.out.printf("CS: OG%n");
                        currentBalance = currentBalance - 15.99;
                        totalSpend = totalSpend + 15.99;
                    } else {
                        System.out.printf("Too Expensive%n");
                    }
                    break;
                case "Zplinter Zell":
                    if (currentBalance >= 19.99) {
                        System.out.printf("Bought Zplinter Zell%n");
                        currentBalance = currentBalance - 19.99;
                        totalSpend = totalSpend + 19.99;
                    } else {
                        System.out.printf("Too Expensive%n");
                    }
                    break;
                case "Honored 2":
                    if (currentBalance >= 59.99) {
                        System.out.printf("Bought Honored 2%n");
                        currentBalance = currentBalance - 59.99;
                        totalSpend = totalSpend + 59.99;
                    } else {
                        System.out.printf("Too Expensive%n");
                    }
                    break;
                case "RoverWatch":
                    if (currentBalance >= 29.99) {
                        System.out.printf("Bought RoverWatch%n");
                        currentBalance = currentBalance - 29.99;
                        totalSpend = totalSpend + 29.99;
                    } else {
                        System.out.printf("Too Expensive%n");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (currentBalance >= 39.99) {
                        System.out.printf("Bought RoverWatch Origins Edition%n");
                        currentBalance = currentBalance - 39.99;
                        totalSpend = totalSpend + 39.99;
                    } else {
                        System.out.printf("Too Expensive%n");
                    }
                    break;
                default:
                    System.out.printf("Not Found%n");

            }
            if (currentBalance == 0) {
                System.out.println("Out of money!");
                break;
            }
            input = scan.nextLine();

        }
        if (currentBalance>0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend,currentBalance);
        }
    }
}
