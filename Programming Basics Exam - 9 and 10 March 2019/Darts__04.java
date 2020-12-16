import java.util.Scanner;

public class Darts__04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String command = scan.nextLine();


        int notGoodShots = 0;
        int allPoints = 301;
        int totalShots = 0;


        while (!command.equals("Retire")) {

            int currentShot = Integer.parseInt(scan.nextLine());

            if (command.equals("Single")) {
                currentShot *= 1;
                totalShots++;
            } else if (command.equals("Double")) {
                currentShot *= 2;
                totalShots++;
            } else if (command.equals("Triple")) {
                currentShot *= 3;
                totalShots++;
            }
            allPoints = allPoints - currentShot;
            if (allPoints == 0) {
                System.out.printf("%s won the leg with %d shots.", name, totalShots);
                break;
            } else if (allPoints < 0) {
                allPoints += currentShot;
                notGoodShots++;
                totalShots--;
            }
            command = scan.nextLine();
        }
        if (command.equals("Retire")) {
            System.out.printf("%s retired after %d unsuccessful shots.", name, notGoodShots);
        }
    }
}