import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String destination = scanner.nextLine();

        String season = scanner.nextLine();

        double days = Double.parseDouble(scanner.nextLine());

        double priceDaysWinter = 0;
        double priceDaysSummer = 0;

        double discountDubai = 0;

        double diff = 0;

        double all = 0;

        double overSofia = 0;



        if(destination.equals("Dubai")){


            switch (season){
                case "Winter":
                    priceDaysWinter = 45000;
                    all = days * priceDaysWinter;

                    discountDubai = all / 100 * 30;

                    all = all - discountDubai;

                    if(budget >= all){
                        diff = budget - all;
                        System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);


                    }else if (all > budget){
                        diff = all - budget;
                        System.out.printf("The director needs %.2f leva more!", diff);

                    }
                    break;

                case "Summer":
                    priceDaysSummer = 40000;
                    all = days * priceDaysSummer;

                    discountDubai = all / 100 * 30;

                    all = all - discountDubai;


                    if(budget >= all){
                        diff = budget - all;
                        System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);


                    }else if (all > budget){
                        diff = all - budget;
                        System.out.printf("The director needs %.2f leva more!", diff);

                    }
                    break;




            }

        }  if(destination.equals("Sofia")){

            switch (season){

                case "Winter":
                    priceDaysWinter = 17000;
                    all = days * priceDaysWinter;

                    overSofia = all / 100 * 25;

                    all = all + overSofia;



                    if(budget >= all){
                        diff = budget - all;
                        System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);


                    }else if (all > budget){
                        diff = all - budget;
                        System.out.printf("The director needs %.2f leva more!", diff);

                    }
                    break;

                case "Summer":
                    priceDaysSummer = 12500;
                    all = days * priceDaysSummer;

                    overSofia = all / 100 * 25;

                    all = all + overSofia;




                    if(budget >= all){
                        diff = budget - all;
                        System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);


                    }else if (all > budget){
                        diff = all - budget;
                        System.out.printf("The director needs %.2f leva more!", diff);

                    }
                    break;
            }

        }


        if(destination.equals("London")){

            switch (season){

                case "Winter":
                    priceDaysWinter = 24000;
                    all = days * priceDaysWinter;



                    if(budget >= all){
                        diff = budget - all;
                        System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);


                    }else if (all > budget){
                        diff = all - budget;
                        System.out.printf("The director needs %.2f leva more!", diff);

                    }
                    break;

                case "Summer":
                    priceDaysSummer = 20250;
                    all = days * priceDaysSummer;




                    if(budget >= all){
                        diff = budget - all;
                        System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);


                    }else if (all > budget){
                        diff = all - budget;
                        System.out.printf("The director needs %.2f leva more!", diff);

                    }
                    break;
            }

        }
    }
}
