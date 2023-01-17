import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countLostGame = Integer.parseInt(scan.nextLine());
        double priceHeadset = Double.parseDouble(scan.nextLine());
        double priceMouse = Double.parseDouble(scan.nextLine());
        double priceKeyboard = Double.parseDouble(scan.nextLine());
        double priceDisplay = Double.parseDouble(scan.nextLine());

        int countHeadset=0;
        int countMouse=0;
        int countKeyboard=0;
        int countDisplay=0;
        for (int i = 1; i <=countLostGame ; i++) {
            if (i%2==0){
                countHeadset++;
            }
            if(i%3==0){
                countMouse++;
            }
            if (i%6==0){
                countKeyboard++;
            }
            if(i%12==0){
                countDisplay++;
            }
        }
        double totalPrice = (countMouse*priceMouse)+(countHeadset*priceHeadset)+(countKeyboard*priceKeyboard)+(countDisplay*priceDisplay);
        System.out.printf("Rage expenses: %.2f lv.%n",totalPrice);
    }
}
