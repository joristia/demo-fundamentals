import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double totalMoney = 0.0;
        double totalCosts = 0.0;

        while (!input.equals("Start")) {
            double inputMoney = Double.parseDouble(input);
            if (inputMoney == 0.1 || inputMoney == 0.2 || inputMoney == 0.5 || inputMoney == 1 || inputMoney == 2) {
                totalMoney += inputMoney;
            } else {
                System.out.printf("Cannot accept %.2f%n", inputMoney);
            }
            input = scan.nextLine();
        }
        String product = scan.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (totalMoney >= 2) {
                        System.out.printf("Purchased Nuts%n");
                        totalMoney = totalMoney - 2;
                        totalCosts = totalCosts + 2;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Water":

                    if (totalMoney >= 0.7) {
                        System.out.printf("Purchased Water%n");
                        totalMoney = totalMoney - 0.7;
                        totalCosts = totalCosts + 0.7;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Crisps":
                    if (totalMoney >= 1.5) {
                        System.out.printf("Purchased Crisps%n");
                        totalMoney = totalMoney - 1.5;
                        totalCosts = totalCosts + 1.5;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Soda":

                    if (totalMoney >= 0.8) {
                        System.out.printf("Purchased Soda%n");
                        totalMoney = totalMoney - 0.8;
                        totalCosts = totalCosts + 0.8;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Coke":
                    if (totalMoney >= 1) {
                        System.out.printf("Purchased Coke%n");
                        totalMoney = totalMoney - 1;
                        totalCosts = totalCosts + 1;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                default:
                    System.out.printf("Invalid product%n");

            }
            product = scan.nextLine();
        }
        System.out.printf("Change: %.2f%n", totalMoney);
    }
}