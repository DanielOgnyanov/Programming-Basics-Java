import java.util.Scanner;

public class TennisEquipment__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceRaketa = Double.parseDouble(scanner.nextLine());

        double numberRaketi = Double.parseDouble(scanner.nextLine());

        double shoes = Double.parseDouble(scanner.nextLine());


        double allPriceRak = priceRaketa * numberRaketi;

        double priceShoes = priceRaketa / 6;

        double allShoes = priceShoes * shoes;

        double priceOther = (allPriceRak + allShoes) * 0.2;

        double all = allPriceRak + allShoes + priceOther;

        double priceDjo = Math.floor(all / 8);
        int priceDjo1 = (int)priceDjo;

        double priceSponsor = Math.ceil(all / 8 * 7);
        int priceSponsor1 = (int)priceSponsor;

        System.out.printf("Price to be paid by Djokovic %d%n", priceDjo1);
        System.out.printf("Price to be paid by sponsors %d", priceSponsor1);



    }
}
