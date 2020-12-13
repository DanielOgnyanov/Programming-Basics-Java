import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Scanner;

public class TravelAgency__03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String city = scanner.nextLine();

        String typePack = scanner.nextLine();

        String discount = scanner.nextLine();

        double day = Double.parseDouble(scanner.nextLine());




        double priceDay = 0;
        double priceAll = 0;

        if(city.equals("Borovets")){



            if ("withEquipment".equals(typePack)) {
                priceDay = 100;
                if (discount.equals("yes")) {
                    priceDay = priceDay * 0.90;
                }
                if (day < 1) {
                    System.out.println("Days must be positive number!");
                    return;
                }
                if (day > 7) {
                    day = day - 1;
                    priceAll = priceDay * day;
                    System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
                    return;
                }
                priceAll = priceDay * day;
                System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
            } else if ("noEquipment".equals(typePack)) {
                priceDay = 80;
                if (discount.equals("yes")) {
                    priceDay = priceDay * 0.95;
                }
                if (day < 1) {
                    System.out.println("Days must be positive number!");
                    return;
                }
                if (day > 7) {
                    day = day - 1;
                    priceAll = priceDay * day;
                    System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
                    return;
                }
                priceAll = priceDay * day;
                System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
            }

            if(!typePack.equals("withEquipment") && !typePack.equals("noEquipment")){
                System.out.println("Invalid input!");

            }

        } else if (city.equals("Bansko")){
            if ("withEquipment".equals(typePack)) {
                priceDay = 100;
                if (discount.equals("yes")) {
                    priceDay = priceDay * 0.90;
                }
                if (day < 1) {
                    System.out.println("Days must be positive number!");
                    return;
                }
                if (day > 7) {
                    day = day - 1;
                    priceAll = priceDay * day;
                    System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
                    return;
                }
                priceAll = priceDay * day;
                System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
            } else if ("noEquipment".equals(typePack)) {
                priceDay = 80;
                if (discount.equals("yes")) {
                    priceDay = priceDay * 0.95;
                }
                if (day < 1) {
                    System.out.println("Days must be positive number!");
                    return;
                }
                if (day > 7) {
                    day = day - 1;
                    priceAll = priceDay * day;
                    System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
                    return;
                }
                priceAll = priceDay * day;
                System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
            }

            if(!typePack.equals("withEquipment") && !typePack.equals("noEquipment")){
                System.out.println("Invalid input!");

            }

            }else if (city.equals("Varna")){
            if ("withBreakfast".equals(typePack)) {
                priceDay = 130;
                if (discount.equals("yes")) {
                    priceDay = priceDay * 0.88;
                }
                if (day < 1) {
                    System.out.println("Days must be positive number!");
                    return;
                }
                if (day > 7) {
                    day = day - 1;
                    priceAll = priceDay * day;
                    System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
                    return;
                }
                priceAll = priceDay * day;
                System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
            } else if ("noBreakfast".equals(typePack)) {
                priceDay = 100;
                if (discount.equals("yes")) {
                    priceDay = priceDay * 0.93;
                }
                if (day < 1) {
                    System.out.println("Days must be positive number!");
                    return;
                }
                if (day > 7) {
                    day = day - 1;
                    priceAll = priceDay * day;
                    System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
                    return;
                }
                priceAll = priceDay * day;
                System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
            }

            if(!typePack.equals("withBreakfast") && !typePack.equals("noBreakfast")){
                System.out.println("Invalid input!");

            }
        }else if (city.equals("Burgas")){
            if ("withBreakfast".equals(typePack)) {
                priceDay = 130;
                if (discount.equals("yes")) {
                    priceDay = priceDay * 0.88;
                }
                if (day < 1) {
                    System.out.println("Days must be positive number!");
                    return;
                }
                if (day > 7) {
                    day = day - 1;
                    priceAll = priceDay * day;
                    System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
                    return;
                }
                priceAll = priceDay * day;
                System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
            } else if ("noBreakfast".equals(typePack)) {
                priceDay = 100;
                if (discount.equals("yes")) {
                    priceDay = priceDay * 0.93;
                }
                if (day < 1) {
                    System.out.println("Days must be positive number!");
                    return;
                }
                if (day > 7) {
                    day = day - 1;
                    priceAll = priceDay * day;
                    System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
                    return;
                }
                priceAll = priceDay * day;
                System.out.printf("The price is %.2flv! Have a nice time!", priceAll);
            }

            if(!typePack.equals("withBreakfast") && !typePack.equals("noBreakfast")){
                System.out.println("Invalid input!");

            }
        }else {
            System.out.println("Invalid input!");
        }

    }
}
