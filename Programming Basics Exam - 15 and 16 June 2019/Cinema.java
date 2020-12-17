import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int space = Integer.parseInt(scanner.nextLine());


        int price = 0;
        int sum = 0;
        int sumSeats = 0;
        int diff = 0;

        String command = scanner.nextLine();


        while (!command.equals("Movie time!")){

            int currentNumber = Integer.parseInt(command);
            sumSeats += currentNumber;

            if(sumSeats > space){
                System.out.println("The cinema is full.");
                System.out.printf("Cinema income - %d lv.", sum);
                break;
            }
            diff = space - sumSeats;


            price = currentNumber * 5;

            if(currentNumber % 3 == 0){
                price = (currentNumber * 5) - 5;


            }

             sum += price;


            command = scanner.nextLine();
        }

        if(command.equals("Movie time!")){

            System.out.printf("There are %d seats left in the cinema.", diff);
            System.out.println();
            System.out.printf("Cinema income - %d lv.", sum);

        }


    }
}
