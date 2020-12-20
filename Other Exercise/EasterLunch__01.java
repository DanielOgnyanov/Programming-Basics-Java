import java.util.Scanner;

public class EasterLunch__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cake = Integer.parseInt(scanner.nextLine());
        int eggsKori = Integer.parseInt(scanner.nextLine());
        int cookies = Integer.parseInt(scanner.nextLine());


        double cakePrice = 3.20;
        double eggsPrice = 4.35;
        double cookiesPrice = 5.40;
        double paint = 0.15;

        double finalCake = cake * cakePrice;
        double finalEggas = eggsKori * eggsPrice;
        double finalCookies = cookies * cookiesPrice;
        double finalPaint = eggsKori * 12 * paint;

        double finalMoney = finalCake + finalEggas + finalCookies + finalPaint;

        System.out.printf("%.2f",finalMoney);


    }
}
