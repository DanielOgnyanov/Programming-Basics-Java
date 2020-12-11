import java.util.Scanner;

public class SchoolThings {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      double packPen = Double.parseDouble(scanner.nextLine());
      double packMarkers = Double.parseDouble(scanner.nextLine());
      double preparatLiter = Double.parseDouble(scanner.nextLine());
      double discount = Double.parseDouble(scanner.nextLine());


      double pen = 5.80;
      double markers = 7.20;
      double preparatL = 1.20;

      double pricePen = packPen * pen;
      double pricemarkers = packMarkers * markers;
      double pricePreparat = preparatLiter * preparatL;
      double allPrice = pricePen + pricemarkers + pricePreparat;
      double priceAfterDiscount = allPrice - ((allPrice * discount) / 100);

        System.out.printf("%.3f", priceAfterDiscount);



    }
}
