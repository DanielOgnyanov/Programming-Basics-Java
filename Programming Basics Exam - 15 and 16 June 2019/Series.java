import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double numberSerial = Double.parseDouble(scanner.nextLine());

        double sumPrice = 0;
        double diff = 0;

        for(double i = 1; i <= numberSerial;i++){

            String nameSeries = scanner.nextLine();
            double currentPriceFilm = Double.parseDouble(scanner.nextLine());




            if(nameSeries.equals("Thrones")){
                currentPriceFilm = currentPriceFilm / 2.0;
                sumPrice += currentPriceFilm;


            }

            if(nameSeries.equals("Lucifer")){
                currentPriceFilm = currentPriceFilm - (currentPriceFilm / 100 * 40);
                sumPrice += currentPriceFilm;

            }

            if(nameSeries.equals("Protector")){
                currentPriceFilm = currentPriceFilm - (currentPriceFilm / 100 * 30);
                sumPrice += currentPriceFilm;

            }

            if(nameSeries.equals("TotalDrama")){
                currentPriceFilm = currentPriceFilm - (currentPriceFilm / 100 * 20);
                sumPrice += currentPriceFilm;

            }

            if(nameSeries.equals("Area")){
                currentPriceFilm = currentPriceFilm - (currentPriceFilm / 100 * 10);
                sumPrice += currentPriceFilm;

            }

            if(!nameSeries.equals("Area") && !nameSeries.equals("TotalDrama") && !nameSeries.equals("Protector") &&
            !nameSeries.equals("Lucifer") && !nameSeries.equals("Thrones")){
                sumPrice += currentPriceFilm;
            }









        }

        if(budget >= sumPrice){
            diff = budget - sumPrice;
            System.out.printf("You bought all the series and left with %.2f lv.", diff);

        } else if (sumPrice > budget){
            diff = sumPrice - budget;
            System.out.printf("You need %.2f lv. more to buy the series!", diff);

        }
    }
}
