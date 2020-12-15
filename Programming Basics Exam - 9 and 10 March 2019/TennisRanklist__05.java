import java.util.Scanner;

public class TennisRanklist__05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());




        int sum = 0;
        double counterW = 0;

        for (int i = 1; i <= numberOfTournaments; i++){
            String command = scanner.nextLine();

            if(command.equals("W")){
                sum += 2000;
                counterW++;

            }else if (command.equals("F")){
                sum += 1200;

            }else if (command.equals("SF")){
               sum += 720;
            }



        }

        int all = sum + points;
        int average = sum / numberOfTournaments;
        double win = (counterW / numberOfTournaments) * 100;

        System.out.printf("Final points: %d", all);
        System.out.println();
        System.out.printf("Average points: %d", average);
        System.out.println();
        System.out.printf("%.2f%%", win);

    }
}
