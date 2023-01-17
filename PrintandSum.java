import java.util.Scanner;

public class PrintandSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = firstNum; i <= secondNum; i++) {
            System.out.printf(i + " ");
            sum += i;
        }
        System.out.printf("%nSum: %d", sum);
    }
}
