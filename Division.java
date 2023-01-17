import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int divNum = 0;
        boolean div = true;
        if (num % 10 == 0) {
            divNum = 10;
        } else if (num % 7 == 0) {
            divNum = 7;
        } else if (num % 6 == 0) {
            divNum = 6;
        } else if (num % 3 == 0) {
            divNum = 3;
        } else if (num % 2 == 0) {
            divNum = 2;
        } else {
            div = false;
        }
        if (div) {
            System.out.printf("The number is divisible by %d", divNum);
        } else {
            System.out.print("Not divisible");
        }
    }
}
