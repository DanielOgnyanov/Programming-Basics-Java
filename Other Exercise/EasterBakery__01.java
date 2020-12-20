import java.util.Scanner;

public class EasterBakery__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double priceBrashno = Double.parseDouble(scanner.nextLine());
        double kgBrashno = Double.parseDouble(scanner.nextLine());
        double kgSugar = Double.parseDouble(scanner.nextLine());
        double broiKoriQica = Double.parseDouble(scanner.nextLine());
        double packetiMaq = Double.parseDouble(scanner.nextLine());



        double priceSugar = priceBrashno * 0.75;

        double priceEggs = priceBrashno * 1.1;

        double priceMaq = priceSugar * 0.2;



        double allBrashno = priceBrashno * kgBrashno;

        double allSugar = priceSugar * kgSugar;

        double allEggs = priceEggs * broiKoriQica;

        double allMaq = priceMaq * packetiMaq;

        double final1 = allBrashno + allSugar + allEggs + allMaq;

        System.out.printf("%.2f", final1);

    }
}
