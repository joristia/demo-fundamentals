import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countPeople = Integer.parseInt(scan.nextLine());
        String typePeople = scan.nextLine();
        String day = scan.nextLine();
        double price = 0.0;


        switch (day) {
            case "Friday":
                if (typePeople.equals("Students")) {
                    price = 8.45;
                } else if (typePeople.equals("Business")) {
                    price = 10.90;
                } else if (typePeople.equals("Regular")) {
                    price = 15;
                }
                break;
            case "Saturday":
                if (typePeople.equals("Students")) {
                    price = 9.80;
                } else if (typePeople.equals("Business")) {
                    price = 15.60;
                } else if (typePeople.equals("Regular")) {
                    price = 20;
                }
                break;
            case "Sunday":
                if (typePeople.equals("Students")) {
                    price = 10.46;
                } else if (typePeople.equals("Business")) {
                    price = 16;
                } else if (typePeople.equals("Regular")) {
                    price = 22.50;
                }
                break;
        }
        double totalPrise = countPeople*price;

        switch (typePeople) {
            case "Students":
                if (countPeople >= 30) {
                    totalPrise = (countPeople * price) * 0.85;
                }
                break;
            case "Business":
                if (countPeople >= 100) {
                    totalPrise = ((countPeople - 10) * price);
                }
                break;
            case "Regular":
                if (countPeople >= 10 && countPeople <= 20) {
                    totalPrise = (countPeople * price) * 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrise);
    }
}
