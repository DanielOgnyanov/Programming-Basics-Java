import java.util.Scanner;

public class TouristShop__04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        double counterPrice = 0;
        int counterProduct = 0;
        double discount = 0;
        double diff = 0;


        while (!command.equals("Stop")){

            command = scanner.nextLine();
            double priceProduct = Double.parseDouble(command);


            counterProduct++;

            if(counterProduct % 3 == 0){
                discount = priceProduct / 2;
                priceProduct = priceProduct - discount;

            }

            counterPrice += priceProduct;

            if(budget < counterPrice){
                diff = counterPrice - budget;
                System.out.printf("You don't have enough money!");
                System.out.println();
                System.out.printf("You need %.2f leva!", diff);
                break;

            }

            command = scanner.nextLine();

        }

        if(command.equals("Stop")){
            System.out.printf("You bought %d products for %.2f leva.", counterProduct, counterPrice);


        }
    }
}
