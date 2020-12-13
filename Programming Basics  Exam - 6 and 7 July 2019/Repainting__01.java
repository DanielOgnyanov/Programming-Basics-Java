import java.util.Scanner;

public class Repainting__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double nai = Double.parseDouble(scanner.nextLine());
        double paint = Double.parseDouble(scanner.nextLine());
        double raz = Double.parseDouble(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double priceNai = (nai + 2) * 1.5;

        double pricePaint = (paint * 1.10) * 14.50;

        double priceRaz = raz * 5;

        double all = priceNai + pricePaint + priceRaz + 0.40;

        double pricePeople = (all / 100 * 30) * hours;

        double fina1 = all + pricePeople;


        System.out.printf("Total expenses: %.2f lv.", fina1);

    }
}
