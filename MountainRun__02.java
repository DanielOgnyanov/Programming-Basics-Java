import java.util.Scanner;

public class MountainRun__02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secFor1Meters = Double.parseDouble(scanner.nextLine());


        double calcSecToTake = meters * secFor1Meters;

        double slower = Math.floor(meters / 50) * 30;

        double all = calcSecToTake + slower;

        double diff = 0;

        if(all < record){


            System.out.printf("Yes! The new record is %.2f seconds.", all);

        } else if (all >= record){

            diff = all - record;

            System.out.printf("No! He was %.2f seconds slower.", diff);
        }

    }
}
