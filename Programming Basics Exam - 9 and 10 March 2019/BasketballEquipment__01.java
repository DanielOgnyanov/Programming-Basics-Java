import java.util.Scanner;

public class BasketballEquipment__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerYear = Double.parseDouble(scanner.nextLine());

        double priceShoesDiscount = pricePerYear / 100 * 40;
        double priceShoe = pricePerYear - priceShoesDiscount;

        double priceClothesDiscount = priceShoe / 100 * 20;
        double priceClothes = priceShoe - priceClothesDiscount;

        double priceBoll = priceClothes / 4;

        double other = priceBoll / 5;

        double all = pricePerYear + priceShoe + priceClothes + priceBoll + other;

        System.out.printf("%.2f", all);
    }
}
