import java.util.Scanner;

public class EasterParty__02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double people = Double.parseDouble(scanner.nextLine());
        double pricePerOnePerson = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double discount = 0;
        double money = 0;
        double cakePrice = budget / 100 * 10;

        if(people < 10){
            money = (pricePerOnePerson * people) + cakePrice;
            if(budget >= money){
                double diff = budget - money;
                System.out.printf("It is party time! %.2f leva left.", diff);

            } else if(money > budget){
                double diff1 = money - budget;
                System.out.printf("No party! %.2f leva needed.", diff1);

            }

        }



        if(people >= 10 && people <= 15){
            discount = pricePerOnePerson / 100 * 15;
            pricePerOnePerson = pricePerOnePerson - discount;
            money = (pricePerOnePerson * people) + cakePrice;
            if(budget >= money){
                double diff = budget - money;
                System.out.printf("It is party time! %.2f leva left.", diff);

            }else if(money > budget){
                double diff1 = money - budget;
                System.out.printf("No party! %.2f leva needed.", diff1);

            }


        }


        if(people > 15 && people <= 20){
            discount = pricePerOnePerson / 100 * 20;
            pricePerOnePerson = pricePerOnePerson - discount;
            money = (pricePerOnePerson * people) + cakePrice;
            if(budget >= money){
                double diff = budget - money;
                System.out.printf("It is party time! %.2f leva left.", diff);
            }else if(money > budget){
                double diff1 = money - budget;
                System.out.printf("No party! %.2f leva needed.", diff1);

            }

        }


        if(people > 20){
            discount = pricePerOnePerson / 100 * 25;
            pricePerOnePerson = pricePerOnePerson - discount;
            money = (pricePerOnePerson * people) + cakePrice;
            if(budget >= money){
                double diff = budget - money;
                System.out.printf("It is party time! %.2f leva left.", diff);
            }else if(money > budget){
                double diff1 = money - budget;
                System.out.printf("No party! %.2f leva needed.", diff1);

            }

        }
    }
}
