import java.util.Scanner;

public class GodzillaVsKong__02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double people = Double.parseDouble(scanner.nextLine());
        double priceDressPerOnePerson = Double.parseDouble(scanner.nextLine());

        double priceDecor = (budget / 100 * 10);

        double priceDressCalc = people * priceDressPerOnePerson;

        double discount = 0;
        double diff = 0;

        if(people > 150){
            discount = (people * priceDressPerOnePerson / 100) * 10;
            priceDressCalc = priceDressCalc - discount;

        }

        double all = priceDecor + priceDressCalc;

        if(budget >= all){
            diff = budget - all;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);

        }else if (all > budget){
            diff = all - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",diff);

        }
    }
}
