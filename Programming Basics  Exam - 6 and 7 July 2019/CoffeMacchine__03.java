import java.util.Scanner;

public class CoffeMacchine__03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String sugar = scanner.nextLine();
        int numberOfDrinks = Integer.parseInt(scanner.nextLine());


        double price = 0;
        double discount = 0;
        double final1 = 0;
        double discount15 = 0;
        double discount5 = 0;

        if (type.equals("Espresso")) {

            switch (sugar) {

                case "Without":
                    price = 0.90;
                    final1 = price * numberOfDrinks;
                    final1 = final1 * 0.65;

                    if (numberOfDrinks >= 5) {
                        final1 = final1 * 0.75;

                    }
                    if (final1 > 15.00) {
                        final1 = final1 * 0.8;

                    }

                    System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, type, final1);
                    break;

                case "Normal":
                    price = 1.00;
                    final1 = price * numberOfDrinks;
                    if (numberOfDrinks > 5) {
                        final1 = final1 * 0.75;

                    }

                    if (final1 > 15.00) {
                        final1 = final1 * 0.8;

                    }

                    System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, type, final1);
                    break;

                case "Extra":
                    price = 1.20;
                    final1 = price * numberOfDrinks;

                    if (numberOfDrinks >= 5) {
                        final1 = final1 * 0.75;

                    }
                    if (final1 > 15.00) {
                        final1 = final1 * 0.8;
                    }

                    System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, type, final1);
                    break;


            }

        } else if (type.equals("Cappuccino")) {
            switch (sugar) {

                case "Without":
                    price = 1.0;
                    final1 = price * numberOfDrinks;
                    final1 = final1 * 0.65;


                    if (final1 > 15.00) {
                        final1 = final1 * 0.8;
                    }
                    System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, type, final1);
                    break;

                case "Normal":
                    price = 1.20;
                    final1 = price * numberOfDrinks;


                    if (final1 > 15.00) {
                        final1 = final1 * 0.8;
                    }
                    System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, type, final1);
                    break;

                case "Extra":
                    price = 1.60;
                    final1 = price * numberOfDrinks;
                    if (final1 > 15.00) {
                        final1 = final1 * 0.8;
                    }
                    System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, type, final1);
                    break;


            }
        } else if (type.equals("Tea")) {

            switch (sugar) {
                case "Without":
                    price = 0.50;
                    final1 = price * numberOfDrinks;
                    final1 = final1 * 0.65;

                    if (final1 > 15.00) {
                        final1 = final1 * 0.8;
                    }
                    System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, type, final1);
                    break;

                case "Normal":
                    price = 0.60;
                    final1 = price * numberOfDrinks;

                    if (final1 > 15.00) {
                        final1 = final1 * 0.8;
                    }
                    System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, type, final1);
                    break;

                case "Extra":
                    price = 0.70;
                    final1 = numberOfDrinks * price;
                    if (final1 > 15.00) {
                        final1 = final1 * 0.8;
                    }
                    System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, type, final1);
                    break;

            }

        }


    }
}