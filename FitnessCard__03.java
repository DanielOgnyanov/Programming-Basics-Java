import java.util.Scanner;

public class FitnessCard__03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String typeOfSport = scanner.nextLine();

        double gymPriceMan = 42;
        double boxingPriceMan = 41;
        double yogaPriceMan = 45;
        double zumbaPriceMan = 34;
        double dancesPriceMan = 51;
        double pilatesPriceMan = 39;

        double needMoney = 0;
        double needMoneyF = 0;


        double gymPriceWoman = 35;
        double boxingPriceWoman = 37;
        double yogaPriceWoman = 42;
        double zumbaPriceWoman = 31;
        double dancesPriceWoman = 53;
        double pilatesPriceWoman = 37;


        if (gender.equals("m")) {
            if (age >= 5 && age <= 19) {
                gymPriceMan = gymPriceMan - (0.20 * gymPriceMan);
                boxingPriceMan = boxingPriceMan - (0.20 * boxingPriceMan);
                yogaPriceMan = yogaPriceMan - (0.20 * yogaPriceMan);
                zumbaPriceMan = zumbaPriceMan - (0.20 * zumbaPriceMan);
                dancesPriceMan = dancesPriceMan - (0.20 * dancesPriceMan);
                pilatesPriceMan = pilatesPriceMan - (0.20 * pilatesPriceMan);


            }

            switch (typeOfSport) {


                case "Gym":
                    if (money >= gymPriceMan) {
                        System.out.printf("You purchased a 1 month pass for %s.", typeOfSport);
                        break;
                    } else if (money < gymPriceMan) {
                        needMoney = gymPriceMan - money;
                    }
                    System.out.printf("You don't have enough money! You need $%.2f more.", needMoney);
                    break;


                case "Boxing":
                    if (money >= boxingPriceMan) {
                        System.out.printf("You purchased a 1 month pass for %s.", typeOfSport);
                        break;

                    } else if (money < boxingPriceMan) {
                        needMoney = boxingPriceMan - money;
                    }
                    System.out.printf("You don't have enough money! You need $%.2f more.", needMoney);
                    break;


                case "Yoga":
                    if (money >= yogaPriceMan) {
                        System.out.printf("You purchased a 1 month pass for %s.", typeOfSport);
                        break;

                    } else if (money < yogaPriceMan) {
                        needMoney = yogaPriceMan - money;
                    }
                    System.out.printf("You don't have enough money! You need $%.2f more.", needMoney);
                    break;


                case "Zumba":
                    if (money >= zumbaPriceMan) {
                        System.out.printf("You purchased a 1 month pass for %s.", typeOfSport);
                        break;

                    } else if (money < zumbaPriceMan) {
                        needMoney = zumbaPriceMan - money;
                    }
                    System.out.printf("You don't have enough money! You need $%.2f more.", needMoney);
                    break;


                case "Dances":
                    if (money >= dancesPriceMan) {
                        System.out.printf("You purchased a 1 month pass for %s.", typeOfSport);
                        break;

                    } else if (money < dancesPriceMan) {
                        needMoney = dancesPriceMan - money;
                    }
                    System.out.printf("You don't have enough money! You need $%.2f more.", needMoney);
                    break;


                case "Pilates":
                    if (money >= pilatesPriceMan) {
                        System.out.printf("You purchased a 1 month pass for %s.", typeOfSport);
                        break;

                    } else if (money < pilatesPriceMan) {
                        needMoney = pilatesPriceMan - money;
                    }
                    System.out.printf("You don't have enough money! You need $%.2f more.", needMoney);
                    break;


            }
        }
        if (gender.equals("f")) {
            if (age >= 5 && age <= 19) {
                gymPriceWoman = gymPriceWoman - (0.20 * gymPriceWoman);
                boxingPriceWoman = boxingPriceWoman - (0.20 * boxingPriceWoman);
                yogaPriceWoman = yogaPriceWoman - (0.20 * yogaPriceWoman);
                zumbaPriceWoman = zumbaPriceWoman - (0.20 * zumbaPriceWoman);
                dancesPriceWoman = dancesPriceWoman - (0.20 * dancesPriceWoman);
                pilatesPriceWoman = pilatesPriceWoman - (0.20 * pilatesPriceWoman);


            }
            switch (typeOfSport) {


                case "Gym":
                    if (money >= gymPriceWoman) {
                        System.out.printf("You purchased a 1 month pass for %s.", typeOfSport);
                        break;

                    } else if (money < gymPriceWoman) {
                        needMoneyF = gymPriceWoman - money;
                    }
                    System.out.printf("You don't have enough money! You need $%.2f more.", needMoneyF);
                    break;


                case "Boxing":
                    if (money >= boxingPriceWoman) {
                        System.out.printf("You purchased a 1 month pass for %s.", typeOfSport);
                        break;

                    } else if (money < boxingPriceWoman) {
                        needMoneyF = boxingPriceWoman - money;
                    }
                    System.out.printf("You don't have enough money! You need $%.2f more.", needMoneyF);
                    break;


                case "Yoga":
                    if (money >= yogaPriceWoman) {
                        System.out.printf("You purchased a 1 month pass for %s.", typeOfSport);
                        break;

                    } else if (money < yogaPriceWoman) {
                        needMoneyF = yogaPriceWoman - money;
                    }
                    System.out.printf("You don't have enough money! You need $%.2f more.", needMoneyF);
                    break;


                case "Zumba":
                    if (money >= zumbaPriceWoman) {
                        System.out.printf("You purchased a 1 month pass for %s.", typeOfSport);
                        break;


                    } else if (money < zumbaPriceWoman) {
                        needMoneyF = zumbaPriceWoman - money;
                    }
                    System.out.printf("You don't have enough money! You need $%.2f more.", needMoneyF);

                    break;


                case "Dances":
                    if (money >= dancesPriceWoman) {
                        System.out.printf("You purchased a 1 month pass for %s.", typeOfSport);
                        break;

                    } else if (money < dancesPriceWoman) {
                        needMoneyF = dancesPriceWoman - money;
                    }
                    System.out.printf("You don't have enough money! You need $%.2f more.", needMoneyF);

                    break;


                case "Pilates":
                    if (money >= pilatesPriceWoman) {
                        System.out.printf("You purchased a 1 month pass for %s.", typeOfSport);
                        break;

                    } else if (money < pilatesPriceWoman) {
                        needMoneyF = pilatesPriceWoman - money;
                    }
                    System.out.printf("You don't have enough money! You need $%.2f more.", needMoneyF);
                    break;


            }
        }


    }
}
