import java.util.Scanner;

public class CareofPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodKg = Integer.parseInt(scanner.nextLine());
        int foodInGram = foodKg * 1000;
        int perDay = 0;
        int finalFood = 0;

        String command = scanner.nextLine();

        while (!command.equals("Adopted")) {

            int dayFood = Integer.parseInt(command);
            perDay += dayFood;
            command = scanner.nextLine();

        }

        if (command.equals("Adopted")) {
            finalFood = foodInGram - perDay;

            if (foodInGram >= perDay) {
                System.out.printf("Food is enough! Leftovers: %d grams.", finalFood);


            } else if (foodInGram < perDay) {
                finalFood = perDay - foodInGram;
                System.out.printf("Food is not enough. You need %d grams more.", finalFood);

            }

        }
    }
}
