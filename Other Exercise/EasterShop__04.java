import java.util.Scanner;

public class EasterShop__04___VAJNA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberEggs = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int sumBuy = 0;




        while (!command.equals("Close")){


            int currentEggs = Integer.parseInt(scanner.nextLine());



            if(command.equals("Buy")){
                if(numberEggs < currentEggs){

                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", numberEggs);
                    break;

                }
                numberEggs -= currentEggs;
                sumBuy += currentEggs;




            }

            if(command.equals("Fill")){
                numberEggs += currentEggs;

            }









            command = scanner.nextLine();


        }

        if(command.equals("Close")){
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", sumBuy);

        }


    }
}
