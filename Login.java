import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String pass = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char digit = username.charAt(i);
            pass += digit;
        }

        String input = scan.nextLine();
        int count = 0;
        while (!input.equals(pass)){
            count++;
            if (count==4){
                System.out.printf("User %s blocked!%n",username);
                break;
            }
            System.out.printf("Incorrect password. Try again.%n");
            input=scan.nextLine();
        }
        if(input.equals(pass)){
            System.out.printf("User %s logged in.",username);
        }
    }
}
