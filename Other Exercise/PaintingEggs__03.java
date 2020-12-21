import java.util.Scanner;

public class PaintingEggs__03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        double numbers = Double.parseDouble(scanner.nextLine());

        double price = 0;
        double calc = 0;
        double exp = 0;


        if(size.equals("Large")){

            switch (color){

                case "Red":
                   price = 16;
                   calc = numbers * price;
                   exp = calc * 0.65;
                    System.out.printf("%.2f leva.", exp);
                    break;

                case "Green":
                    price = 12;
                    calc = numbers * price;
                    exp = calc * 0.65;
                    System.out.printf("%.2f leva.", exp);
                    break;

                case "Yellow":
                    price = 9;
                    calc = numbers * price;
                    exp = calc * 0.65;
                    System.out.printf("%.2f leva.", exp);
                    break;


            }

        }
        if(size.equals("Medium")){
            switch (color){
                case "Red":
                    price = 13;
                    calc = numbers * price;
                    exp = calc * 0.65;
                    System.out.printf("%.2f leva.", exp);
                    break;

                case "Green":
                    price = 9;
                    calc = numbers * price;
                    exp = calc * 0.65;
                    System.out.printf("%.2f leva.", exp);
                    break;

                case "Yellow":
                    price = 7;
                    calc = numbers * price;
                    exp = calc * 0.65;
                    System.out.printf("%.2f leva.", exp);
                    break;

            }


        }

        if(size.equals("Small")){
            switch (color){
                case "Red":
                    price = 9;
                    calc = numbers * price;
                    exp = calc * 0.65;
                    System.out.printf("%.2f leva.", exp);
                    break;

                case "Green":
                    price = 8;
                    calc = numbers * price;
                    exp = calc * 0.65;
                    System.out.printf("%.2f leva.", exp);
                    break;

                case "Yellow":
                    price = 5;
                    calc = numbers * price;
                    exp = calc * 0.65;
                    System.out.printf("%.2f leva.", exp);
                    break;

            }

        }
    }
}
