import java.util.Scanner;

public class CatWalk__02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int walks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int minutesWalkPerDay = minutesWalk * walks;
        int caloriesPerDay = minutesWalkPerDay * 5;
        int caloriesPerDay50 = caloriesPerDay / 2;
        int calories2 = calories / 2;


        if(caloriesPerDay >= calories2){

            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", caloriesPerDay);
        }

        else if (caloriesPerDay < calories2) {

            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesPerDay);
        }
    }
}
