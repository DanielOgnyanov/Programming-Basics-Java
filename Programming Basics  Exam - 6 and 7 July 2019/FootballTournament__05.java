import java.util.Scanner;

public class FootballTournament__05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double numberMatch = Double.parseDouble(scanner.nextLine());

        int counterPoint = 0;
        int counterW = 0;
        int counterD = 0;
        int counterL = 0;

        if(numberMatch < 1){
            System.out.printf("%s hasn't played any games during this season.", name);

        }



        for(double i = 1; i <= numberMatch; i++){
             String command = scanner.nextLine();

              if(command.equals("W")){
                  counterPoint += 3;
                  counterW++;

              }

            if(command.equals("D")){
                counterPoint += 1;
                counterD++;

            }

            if(command.equals("L")){
               counterL++;
            }
            if(i >= numberMatch){
                double procentWin = counterW / numberMatch * 100;

                System.out.printf("%s has won %d points during this season.\n", name, counterPoint);
                System.out.printf("Total stats:\n");
                System.out.printf("## W: %d\n", counterW);
                System.out.printf("## D: %d\n", counterD);
                System.out.printf("## L: %d\n", counterL);
                System.out.printf("Win rate: %.2f%%\n", procentWin);
            }


        }







    }
}
