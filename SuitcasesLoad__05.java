import java.util.Scanner;

public class SuitcasesLoad__05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();

        double sum = 0;



        int counterCase = 0;
        int counterAcc = 0;



        while (!command.equals("End")){

            double currentBag = Double.parseDouble(command);
            counterAcc ++;



            if(counterAcc % 3 == 0){

                currentBag = (currentBag / 100 * 10) + currentBag;


            }


            if(capacity < currentBag){
                System.out.printf("No more space!");
                System.out.println();
                System.out.printf("Statistic: %d suitcases loaded.", counterCase);
                break;

            }



            capacity -= currentBag;
            counterCase++;
            command = scanner.nextLine();

        }

        if(command.equals("End")){
            System.out.printf("Congratulations! All suitcases are loaded!");
            System.out.println();
            System.out.printf("Statistic: %d suitcases loaded.", counterCase);
        }


    }
}
