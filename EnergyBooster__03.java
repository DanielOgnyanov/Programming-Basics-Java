import java.util.Scanner;

public class EnergyBooster__03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nameFruit = scanner.nextLine();

        String size = scanner.nextLine();

        double numbers = Double.parseDouble(scanner.nextLine());

        double price = 0;
        double all = 0;
        double all2 = 0;

        if (size.equals("big")) {

            switch (nameFruit) {

                case "Watermelon":
                    price = 28.70;
                    all = price * 5;
                    all2 = all * numbers;

                    if (all2 < 400) {
                        System.out.printf("%.2f lv.", all2);

                    }

                    if (all2 >= 400 && all2 <= 1000) {
                        all2 = all2 * 0.85;
                        System.out.printf("%.2f lv.", all2);
                    }

                    if (all2 > 1000) {
                        all2 = all2 / 2;
                        System.out.printf("%.2f lv.", all2);

                    }


                    break;

                case "Mango":
                    price = 19.60;
                    all = price * 5;
                    all2 = all * numbers;

                    if (all2 < 400) {
                        System.out.printf("%.2f lv.", all2);

                    }
                    if (all2 >= 400 && all2 <= 1000) {
                        all2 = all2 * 0.85;
                        System.out.printf("%.2f lv.", all2);
                    }

                    if (all2 > 1000) {
                        all2 = all2 / 2;
                        System.out.printf("%.2f lv.", all2);

                    }


                    break;

                case "Pineapple":
                    price = 24.80;
                    all = price * 5;
                    all2 = all * numbers;


                    if (all2 < 400) {
                        System.out.printf("%.2f lv.", all2);

                    }
                    if (all2 >= 400 && all2 <= 1000) {
                        all2 = all2 * 0.85;
                        System.out.printf("%.2f lv.", all2);
                    }

                    if (all2 > 1000) {
                        all2 = all2 / 2;
                        System.out.printf("%.2f lv.", all2);

                    }

                    break;

                case "Raspberry":
                    price = 15.20;
                    all = price * 5;
                    all2 = all * numbers;

                    if (all2 < 400) {
                        System.out.printf("%.2f lv.", all2);

                    }
                    if (all2 >= 400 && all2 <= 1000) {
                        all2 = all2 * 0.85;
                        System.out.printf("%.2f lv.", all2);

                    }

                    if (all2 > 1000) {
                        all2 = all2 / 2;
                        System.out.printf("%.2f lv.", all2);


                    }


                    break;

            }

        }

        if (size.equals("small")) {

            switch (nameFruit) {

                case "Watermelon":
                    price = 56;
                    all = price * 2;
                    all2 = all * numbers;

                    if (all2 < 400) {
                        System.out.printf("%.2f lv.", all2);

                    }

                    if (all2 >= 400 && all2 <= 1000) {
                        all2 = all2 * 0.85;
                        System.out.printf("%.2f lv.", all2);
                    }

                    if (all2 > 1000) {
                        all2 = all2 / 2;
                        System.out.printf("%.2f lv.", all2);


                    }


                    break;

                case "Mango":
                    price = 36.66;
                    all = price * 2;
                    all2 = all * numbers;

                    if (all2 < 400) {
                        System.out.printf("%.2f lv.", all2);

                    }
                    if (all2 >= 400 && all2 <= 1000) {
                        all2 = all2 * 0.85;
                        System.out.printf("%.2f lv.", all2);

                    }

                    if (all2 > 1000) {
                        all2 = all2 / 2;
                        System.out.printf("%.2f lv.", all2);


                    }


                    break;

                case "Pineapple":
                    price = 42.10;
                    all = price * 2;
                    all2 = all * numbers;

                    if (all2 < 400) {
                        System.out.printf("%.2f lv.", all2);

                    }
                    if (all2 >= 400 && all2 <= 1000) {
                        all2 = all2 * 0.85;
                        System.out.printf("%.2f lv.", all2);

                    }

                    if (all2 > 1000) {
                        all2 = all2 / 2;
                        System.out.printf("%.2f lv.", all2);


                    }


                    break;

                case "Raspberry":
                    price = 20;
                    all = price * 2;
                    all2 = all * numbers;

                    if (all2 < 400) {
                        System.out.printf("%.2f lv.", all2);

                    }
                    if (all2 >= 400 && all2 <= 1000) {
                        all2 = all2 * 0.85;
                        System.out.printf("%.2f lv.", all2);


                    }

                    if (all2 > 1000) {
                        all2 = all2 / 2;
                        System.out.printf("%.2f lv.", all2);


                    }


                    break;


            }

        }
    }
}
