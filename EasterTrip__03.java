import java.util.Scanner;

public class EasterTrip__03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfCountry = scanner.nextLine();
        String date = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double priceNight = 0;
        double priceAllNight = 0;

        if(nameOfCountry.equals("France")){

            switch (date){
                case "21-23":
                    priceNight = 30;
                    priceAllNight = priceNight * days;
                    System.out.printf("Easter trip to %s : %.2f leva.", nameOfCountry, priceAllNight);
                    break;
                case "24-27":
                    priceNight = 35;
                    priceAllNight = priceNight * days;
                    System.out.printf("Easter trip to %s : %.2f leva.", nameOfCountry, priceAllNight);
                    break;
                case "28-31":
                    priceNight = 40;
                    priceAllNight = priceNight * days;
                    System.out.printf("Easter trip to %s : %.2f leva.", nameOfCountry, priceAllNight);
                    break;




            }

        } if(nameOfCountry.equals("Italy")){


            switch (date){
                case "21-23":
                    priceNight = 28;
                    priceAllNight = priceNight * days;
                    System.out.printf("Easter trip to %s : %.2f leva.", nameOfCountry, priceAllNight);
                    break;
                case "24-27":
                    priceNight = 32;
                    priceAllNight = priceNight * days;
                    System.out.printf("Easter trip to %s : %.2f leva.", nameOfCountry, priceAllNight);
                    break;
                case "28-31":
                    priceNight = 39;
                    priceAllNight = priceNight * days;
                    System.out.printf("Easter trip to %s : %.2f leva.", nameOfCountry, priceAllNight);
                    break;
            }

        }


        if(nameOfCountry.equals("Germany")){
            switch (date){
                case "21-23":
                    priceNight = 32;
                    priceAllNight = priceNight * days;
                    System.out.printf("Easter trip to %s : %.2f leva.", nameOfCountry, priceAllNight);
                    break;
                case "24-27":
                    priceNight = 37;
                    priceAllNight = priceNight * days;
                    System.out.printf("Easter trip to %s : %.2f leva.", nameOfCountry, priceAllNight);
                    break;
                case "28-31":
                    priceNight = 43;
                    priceAllNight = priceNight * days;
                    System.out.printf("Easter trip to %s : %.2f leva.", nameOfCountry, priceAllNight);
                    break;

            }

        }
    }
}
