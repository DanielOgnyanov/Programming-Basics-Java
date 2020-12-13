import java.util.Scanner;

public class PoolDay__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double people = Double.parseDouble(scanner.nextLine());
        double priceEnter = Double.parseDouble(scanner.nextLine());
        double priceBed = Double.parseDouble(scanner.nextLine());
        double priceChe = Double.parseDouble(scanner.nextLine());

        double priceForEnter = priceEnter * people;

        double peopleBed = Math.ceil(people / 100 * 75);

        double pricePeopleBed = peopleBed * priceBed;

        double peopleCheCalc = Math.ceil(people / 100 * 50);

        double pricePeopleChe = peopleCheCalc * priceChe;

        double all = priceForEnter + pricePeopleBed + pricePeopleChe;

        System.out.printf("%.2f lv.", all);



    }
}
