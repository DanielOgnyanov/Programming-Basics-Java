import java.util.Scanner;

public class OscarsCeremony__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());

        double priceStatue = budget -(budget / 100 * 30);

        double priceket = priceStatue -(priceStatue / 100 * 15);

        double priceSound = priceket / 2;

        double all = budget + priceStatue + priceket + priceSound;

        System.out.printf("%.2f", all);
    }
}
