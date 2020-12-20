import java.util.Scanner;

public class EasterEggs__05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allEggs = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int counterRed = 0;
        int counterOrange = 0;
        int counterBlue = 0;
        int counterGreen = 0;

        String color = "";

        int max = Integer.MIN_VALUE;


        for(int i = 1; i <= allEggs;i++){




            if(command.equals("red")){
                counterRed++;

            }

            if(command.equals("orange")){
                counterOrange++;

            }

            if(command.equals("blue")){
                counterBlue++;

            }

            if(command.equals("green")){
                counterGreen++;

            }





            if(counterRed > max){
                max = counterRed;
                 color = "red";

            }

            if(counterOrange > max){
                max = counterOrange;
                color = "orange";

            }

            if(counterBlue > max){
                max = counterBlue;
                color = "blue";

            }

            if(counterGreen > max){
                max = counterGreen;
                color = "green";

            }





            if(i >= allEggs){
                System.out.printf("Red eggs: %d", counterRed);
                System.out.println();
                System.out.printf("Orange eggs: %d", counterOrange);
                System.out.println();
                System.out.printf("Blue eggs: %d", counterBlue);
                System.out.println();
                System.out.printf("Green eggs: %d", counterGreen);
                System.out.println();
                System.out.printf("Max eggs: %d -> %s", max, color);
                break;

            }
            command = scanner.nextLine();



        }
    }
}
