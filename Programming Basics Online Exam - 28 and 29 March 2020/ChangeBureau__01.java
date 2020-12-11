import java.util.Scanner;

public class ChangeBureau__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double bitcoin = Double.parseDouble(scanner.nextLine());
        double ioan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinPrice = 1168;
        double ioanPrice = 0.15;
        double dolarPrice = 1.76;
        double euroPrice = 1.95;

        double allBit = bitcoin * bitcoinPrice;

        double allIoan = ioan * ioanPrice;

        double ioanToleva = allIoan * dolarPrice;

        double all = allBit + ioanToleva;

        double levatoEu = all / 1.95;

        double commissionPrice = levatoEu / 100 * commission;

        double final1 = levatoEu - commissionPrice;

        System.out.printf("%.2f", final1);

    }
}
