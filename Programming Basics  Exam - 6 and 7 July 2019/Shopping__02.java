import java.util.Scanner;

public class Shopping__02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        double videoCards = Double.parseDouble(scanner.nextLine());
        double processors = Double.parseDouble(scanner.nextLine());
        double ram = Double.parseDouble(scanner.nextLine());

        double diff = 0;


        double priceVideoCards = videoCards * 250;

        double priceProcessors = (priceVideoCards * 0.35) * processors;

        double priceRam = (priceVideoCards * 0.10) * ram;


        double all = priceVideoCards + priceProcessors + priceRam;

        if(videoCards > processors){
            all = all * 0.85;

        }


        if (all <= budget){
            diff =  budget - all;
            System.out.printf("You have %.2f leva left!", diff);

        } else if (all > budget){
            diff = all - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }



    }
}
