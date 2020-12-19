import java.util.Scanner;

public class CinemaVoucher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double voucherPrice = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();

        double priceBillet = 0;
        double priceProduct = 0;

        double sum = 0;

        int counterBillet = 0;
        int counterProduct = 0;


        while(!command.equals("End")){
            int num = command.length();

            if(command.length() > 8){

                char first = command.charAt(0);
                int ascii1 = (int)first;
                char second = command.charAt(1);
                int ascii2 = (int)second;


                priceBillet = ascii1 + ascii2;
                sum += priceBillet;
                if(sum > voucherPrice){
                    System.out.println(counterBillet);
                    System.out.println(counterProduct);
                    break;
                }

                counterBillet++;

            }

            if(command.length() <= 8){

                char first = command.charAt(0);
                int ascii1 = (int)first;


                priceProduct = ascii1;
                sum += priceProduct;
                if(sum > voucherPrice){
                    System.out.println(counterBillet);
                    System.out.println(counterProduct);
                    break;
                }

                counterProduct++;

            }



            command = scanner.nextLine();
        }


        if(command.equals("End")){
            System.out.println(counterBillet);
            System.out.println(counterProduct);

        }
    }
}
