import java.util.Scanner;

public class CatExpenses__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceBed = Double.parseDouble(scanner.nextLine());
        double priceToa = Double.parseDouble(scanner.nextLine());


        double priceFoodMo = priceToa * 1.25;

        double priceIg = priceFoodMo / 2;

        double priceVet = priceIg * 1.10;

        double sum = priceFoodMo + priceIg + priceVet + priceToa;

        double other = (sum / 100) * 5;

        double all = priceBed + (12 * sum) + (12 * other);

        System.out.printf("%.2f lv.", all);
    }
}
