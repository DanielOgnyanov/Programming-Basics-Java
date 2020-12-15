import java.util.Scanner;

public class Skeleton__02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double minutes = Double.parseDouble(scanner.nextLine());
        double seconds = Double.parseDouble(scanner.nextLine());
        double lun = Double.parseDouble(scanner.nextLine());
        double secondsFor100 = Double.parseDouble(scanner.nextLine());



        double transformInSec = minutes * 60 + seconds;

        double slow = lun / 120;

        double slowTime = slow * 2.5;

        double all = ((lun / 100) * secondsFor100) - slowTime;

        double diff = 0;

        if(all <= transformInSec){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", all);

        } else if (all > transformInSec){
            diff = all - transformInSec;
            System.out.printf("No, Marin failed! He was %.3f second slower.", diff);

        }



    }
}
