import java.util.Scanner;

public class Safari__02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double oil = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double priceOil = 2.10;
        double priceGuide = 100;


        double oilFinal = oil * priceOil;
        double all = oilFinal + priceGuide;

        double finalAfterDiscount = 0;


        if(day.equals("Saturday")){

            double discount = all * 0.10;
             finalAfterDiscount = all - discount;

            if(budget >= finalAfterDiscount){
                double diff = budget - finalAfterDiscount;
                System.out.printf("Safari time! Money left: %.2f lv.", diff);

            } else if (finalAfterDiscount > budget){
                double diff1 = finalAfterDiscount - budget;
                System.out.printf("Not enough money! Money needed: %.2f lv.", diff1);

            }

        }


        if(day.equals("Sunday")){
            double discount = all * 0.20;
             finalAfterDiscount = all - discount;

            if(budget >= finalAfterDiscount){
                double diff = budget - finalAfterDiscount;
                System.out.printf("Safari time! Money left: %.2f lv.", diff);

            } else if (finalAfterDiscount > budget){
                double diff1 = finalAfterDiscount - budget;
                System.out.printf("Not enough money! Money needed: %.2f lv.", diff1);

            }


        }
    }
}
