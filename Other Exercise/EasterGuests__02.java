import java.util.Scanner;

public class EasterGuests__02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double people = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double diff = 0;

        double allKu = Math.ceil(people / 3);
        int allKu1 = (int)allKu;

        double allEggs = people * 2;
        int allEggs1 = (int)allEggs;

        double priceKu = allKu * 4;

        double priceEggs = allEggs * 0.45;

        double all = priceKu + priceEggs;

        if(all <= budget){
            diff = budget - all;
            System.out.printf("Lyubo bought %d Easter bread and %d eggs.",allKu1 , allEggs1);
            System.out.println();
            System.out.printf("He has %.2f lv. left.", diff);

        }
        if (all > budget){
            diff = all - budget;
            System.out.printf("Lyubo doesn't have enough money.");
            System.out.println();
            System.out.printf("He needs %.2f lv. more.", diff);

        }

    }
}
