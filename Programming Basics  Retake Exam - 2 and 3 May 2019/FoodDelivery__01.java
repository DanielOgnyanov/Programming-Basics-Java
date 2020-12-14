import java.util.Scanner;

public class FoodDelivery__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double chicken = Double.parseDouble(scanner.nextLine());
        double fish = Double.parseDouble(scanner.nextLine());
        double vegan = Double.parseDouble(scanner.nextLine());

        double chickenPrice = 10.35;
        double fishPrice = 12.40;
        double veganPrice = 8.15;
        double delivery = 2.50;

        double allChicken = chicken * chickenPrice;
        double allFish = fish * fishPrice;
        double allVegan = vegan * veganPrice;

        double all = allChicken + allFish + allVegan;


        double desertPrice = all / 100 * 20;

        double total = all + desertPrice + delivery;

        System.out.printf("Total: %.2f", total);






    }
}
