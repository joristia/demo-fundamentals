import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scan.nextLine());
        int countOfStudents = Integer.parseInt(scan.nextLine());
        double priceOfLightsaberg = Double.parseDouble(scan.nextLine());
        double priceOfRobes = Double.parseDouble(scan.nextLine());
        double priceOfBelts = Double.parseDouble(scan.nextLine());

        double allLightsabers = Math.ceil(countOfStudents * 1.1) * priceOfLightsaberg;
        double allRobes = countOfStudents * priceOfRobes;
        double allBelts = (countOfStudents - (countOfStudents / 6)) * priceOfBelts;

        double totalPrice = allBelts + allLightsabers + allRobes;
        if (totalPrice <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalPrice - amountOfMoney));
        }
    }
}
