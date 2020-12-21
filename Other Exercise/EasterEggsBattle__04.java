import java.util.Scanner;

public class EasterEggsBattle__04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int eggsFirst = Integer.parseInt(scanner.nextLine());
        int eggsSecond = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int counter1 = 0;
        int counter2 = 0;


        while (!command.equals("End of battle")){





            if("one".equals(command)){
                 eggsSecond = eggsSecond - 1;

             }
            if(eggsSecond <= 0){
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.",eggsFirst);
                break;


            }



             if("two".equals(command)){
                 eggsFirst = eggsFirst - 1;

             }

            if(eggsFirst <= 0){
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsSecond);
                break;

            }




            command = scanner.nextLine();


        } if(command.equals("End of battle")){
            System.out.printf("Player one has %d eggs left.", eggsFirst);
            System.out.println();
            System.out.printf("Player two has %d eggs left.", eggsSecond);

        }


    }
}
