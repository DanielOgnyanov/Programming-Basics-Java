import java.util.Scanner;

public class FamilyTrip__02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double nights = Double.parseDouble(scanner.nextLine());
        double priceNights = Double.parseDouble(scanner.nextLine());
        double percentOver = Double.parseDouble(scanner.nextLine());

        double discount = 0;
        double allNight = 0;
        double moneyOver = 0;

        double allMoney = 0;
        double diff = 0;



        if(nights <= 7){
            allNight = priceNights * nights;
            moneyOver = budget / 100 * percentOver;

            allMoney = allNight + moneyOver;

        }


        if(nights > 7){

            discount = priceNights / 100 * 5;
            priceNights = priceNights - discount;
            allNight = priceNights * nights;
            moneyOver = budget / 100 * percentOver;

            allMoney = allNight + moneyOver;
        }


        if(budget >= allMoney){
            diff = budget - allMoney;
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);

        }

        if(allMoney > budget){
            diff = allMoney - budget;
            System.out.printf("%.2f leva needed.", diff);

        }
    }
}
