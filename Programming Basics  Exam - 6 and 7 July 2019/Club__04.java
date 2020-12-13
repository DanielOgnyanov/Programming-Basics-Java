import java.util.Scanner;

public class Club__04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double profit = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();

        double sum = 0;
        double diff = 0;


        while (!command.equals("Party!")){

            int numCocteil = command.length();
            int currentCocteilNumber = Integer.parseInt(scanner.nextLine());

            double calcDrinks = numCocteil * currentCocteilNumber;


            if(calcDrinks % 2 == 0){

                calcDrinks = numCocteil * currentCocteilNumber;;


            } else {
                calcDrinks = calcDrinks * 0.75;

            }

            sum += calcDrinks;

            if(sum >= profit){
                diff = sum - profit;
                System.out.printf("Target acquired.");
                System.out.println();
                System.out.printf("Club income - %.2f leva.", sum);
                break;

            }


            command = scanner.nextLine();


        }

        if(command.equals("Party!")){
            if(profit > sum){
                diff = profit - sum;
                System.out.printf("We need %.2f leva more.", diff);
                System.out.println();
                System.out.printf("Club income - %.2f leva.", sum);

            }


        }
    }
}
