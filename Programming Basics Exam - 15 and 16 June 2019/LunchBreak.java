import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameSeries = scanner.nextLine();

        double longSeries = Double.parseDouble(scanner.nextLine());

        double lunch = Double.parseDouble(scanner.nextLine());



        double timeEat = lunch / 8;

        double relax = lunch / 4;

        double timeLeft = (lunch - timeEat) - relax;

        double diff = 0;

        if(timeLeft >= longSeries){

            diff = Math.ceil(timeLeft - longSeries);
            int diff1 = (int)(diff);

            System.out.printf("You have enough time to watch %s and left with %d minutes free time.", nameSeries , diff1);



        }

        if(longSeries > timeLeft){
            diff = Math.ceil(longSeries - timeLeft);
            int diff2 = (int)(diff);

            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.", nameSeries , diff2);
        }
    }
}