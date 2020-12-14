import java.util.Scanner;

public class DivisionWithoutRemainder__05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double counter1 = 0;
        double counter2 = 0;
        double counter3 = 0;

        double procent1 = 0;
        double procent2 = 0;
        double procent3 = 0;


        for (int i = 1;i <= number;i++){

            int currentNumber = Integer.parseInt(scanner.nextLine());



            if(currentNumber % 2 == 0){
                 counter1++;
            }

            if(currentNumber % 3 == 0){
                counter2++;

            }

            if(currentNumber % 4 == 0){
                counter3++;

            }







        }

        procent1 = counter1 / number * 100;
        procent2 = counter2 / number * 100;
        procent3 = counter3 / number * 100;

        System.out.printf("%.2f%%", procent1);
        System.out.println();
        System.out.printf("%.2f%%", procent2);
        System.out.println();
        System.out.printf("%.2f%%", procent3);





    }
}
