import java.util.Scanner;

public class OscarsWeekInCinema_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameFilm = scanner.nextLine();
        String nameSalon = scanner.nextLine();
        double ticket = Double.parseDouble(scanner.nextLine());

        double normalPrice = 0;
        double luxuryPrice = 0;
        double ultraLuxuryPrice = 0;

        double money = 0;


        if(nameFilm.equals("A Star Is Born")){


            switch (nameSalon){
                case "normal":
                    normalPrice = 7.50;
                    money = ticket * normalPrice;
                    System.out.printf("%s -> %.2f lv.", nameFilm , money);
                    break;

                case "luxury":
                    luxuryPrice = 10.50;
                    money = ticket * luxuryPrice;
                    System.out.printf("%s -> %.2f lv.", nameFilm , money);
                    break;

                case "ultra luxury":
                    ultraLuxuryPrice = 13.50;
                    money = ticket * ultraLuxuryPrice;
                    System.out.printf("%s -> %.2f lv.", nameFilm , money);
                    break;

            }

        }

        if(nameFilm.equals("Bohemian Rhapsody")){

            switch (nameSalon){
                case "normal":
                    normalPrice = 7.35;
                    money = ticket * normalPrice;
                    System.out.printf("%s -> %.2f lv.", nameFilm , money);
                    break;

                case "luxury":
                    luxuryPrice = 9.45;
                    money = ticket * luxuryPrice;
                    System.out.printf("%s -> %.2f lv.", nameFilm , money);
                    break;

                case "ultra luxury":
                    ultraLuxuryPrice = 12.75;
                    money = ticket * ultraLuxuryPrice;
                    System.out.printf("%s -> %.2f lv.", nameFilm , money);
                    break;

            }

        }

        if(nameFilm.equals("Green Book")){

            switch (nameSalon){
                case "normal":
                    normalPrice = 8.15;
                    money = ticket * normalPrice;
                    System.out.printf("%s -> %.2f lv.", nameFilm , money);
                    break;

                case "luxury":
                    luxuryPrice = 10.25;
                    money = ticket * luxuryPrice;
                    System.out.printf("%s -> %.2f lv.", nameFilm , money);
                    break;

                case "ultra luxury":
                    ultraLuxuryPrice = 13.25;
                    money = ticket * ultraLuxuryPrice;
                    System.out.printf("%s -> %.2f lv.", nameFilm , money);
                    break;

            }

        }

        if(nameFilm.equals("The Favourite")){

            switch (nameSalon){
                case "normal":
                    normalPrice = 8.75;
                    money = ticket * normalPrice;
                    System.out.printf("%s -> %.2f lv.", nameFilm , money);
                    break;

                case "luxury":
                    luxuryPrice = 11.55;
                    money = ticket * luxuryPrice;
                    System.out.printf("%s -> %.2f lv.", nameFilm , money);
                    break;

                case "ultra luxury":
                    ultraLuxuryPrice = 13.95;
                    money = ticket * ultraLuxuryPrice;
                    System.out.printf("%s -> %.2f lv.", nameFilm , money);
                    break;

            }


        }
    }
}
