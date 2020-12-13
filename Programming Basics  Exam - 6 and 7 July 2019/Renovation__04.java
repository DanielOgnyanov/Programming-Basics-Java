import java.util.Scanner;

public class Renovation__04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vis = Integer.parseInt(scanner.nextLine());
        int shi = Integer.parseInt(scanner.nextLine());

        double procentNo = Double.parseDouble(scanner.nextLine());

        double all = vis * shi * 4;
        double bez = (all / 100) * procentNo;
        double plosht = Math.ceil(all - bez);
        int plosht1 = (int)plosht;

        String command = scanner.nextLine();
        double boq = 0;
        double diff = 0;

        while (!command.equals("Tired!")){
            double currentNumber = Double.parseDouble(command);

            if(plosht == currentNumber){
                System.out.printf("All walls are painted! Great job, Pesho!");
                break;

            }

            if(plosht < currentNumber){
                diff = currentNumber - plosht;
                int diff1 = (int)diff;
                System.out.printf("All walls are painted and you have %d l paint left!",diff1);
                break;

            }

            boq += currentNumber;

            plosht -= currentNumber;
            plosht1 = (int)plosht;




            command = scanner.nextLine();



        }if (command.equals("Tired!")){
            System.out.printf("%d quadratic m left.", plosht1);


        }
    }
}
