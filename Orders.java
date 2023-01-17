import javax.swing.*;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countOrders = Integer.parseInt(scan.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= countOrders ; i++) {
            double pricePerCapsule = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsules = Integer.parseInt(scan.nextLine());

            double coffiePrise = (days*capsules)*pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n",coffiePrise);
            totalPrice +=coffiePrise;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
