import java.util.Scanner;

public class TrekkingMania__04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int group = Integer.parseInt(scanner.nextLine());

        double counterMusala = 0;
        double counterMonblanc = 0;
        double counterKilimandjaro = 0;
        double counterK2 = 0;
        double counterEverest = 0;

        double counterAll = 0;


        double counterMusalaProcent = 0;
        double counterMonblancProcent = 0;
        double counterKilimandjaroProcent = 0;
        double counterK2Procent = 0;
        double counterEverestProcent = 0;


        for (int i = 1; i <= group; i++) {

            int currentNumbersOfPeople = Integer.parseInt(scanner.nextLine());

            if (currentNumbersOfPeople <= 5) {
                counterMusala += currentNumbersOfPeople;
                counterAll += currentNumbersOfPeople;

            }
            if (currentNumbersOfPeople >= 6 && currentNumbersOfPeople <= 12) {

                counterMonblanc += currentNumbersOfPeople;
                counterAll += currentNumbersOfPeople;
            }

            if (currentNumbersOfPeople >= 13 && currentNumbersOfPeople <= 25) {

                counterKilimandjaro += currentNumbersOfPeople;
                counterAll += currentNumbersOfPeople;

            }

            if (currentNumbersOfPeople >= 26 && currentNumbersOfPeople <= 40) {
                counterK2 += currentNumbersOfPeople;
                counterAll += currentNumbersOfPeople;

            }

            if (currentNumbersOfPeople >= 41) {
                counterEverest += currentNumbersOfPeople;
                counterAll += currentNumbersOfPeople;
            }


        }

        counterMusalaProcent = counterMusala / counterAll * 100;
        counterMonblancProcent = counterMonblanc / counterAll * 100;
        counterKilimandjaroProcent = counterKilimandjaro / counterAll * 100;
        counterK2Procent = counterK2 / counterAll * 100;
        counterEverestProcent = counterEverest / counterAll * 100;

        System.out.printf("%.2f%%", counterMusalaProcent);
        System.out.println();
        System.out.printf("%.2f%%", counterMonblancProcent);
        System.out.println();
        System.out.printf("%.2f%%", counterKilimandjaroProcent);
        System.out.println();
        System.out.printf("%.2f%%", counterK2Procent);
        System.out.println();
        System.out.printf("%.2f%%", counterEverestProcent);


    }
}
