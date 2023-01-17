import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int n = Integer.parseInt(input);
        int firstN = n;
        int length = input.length();
        int factorial = 1;
        int sumFactorial = 0;
        for (int i = 1; i <=length ; i++) {
            int lastNum = n%10;
            for (int j = 2; j <=lastNum; j++) {
                factorial=factorial*j;
            }
            sumFactorial+=factorial;
            n=n/10;
            factorial=1;
        }
        if (firstN==sumFactorial){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
