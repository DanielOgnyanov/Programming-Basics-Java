import java.util.Scanner;

public class WorldSnookerChampionship__03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String etap = scanner.nextLine();

        String typeTicket = scanner.nextLine();

        int numberOfTicket = Integer.parseInt(scanner.nextLine());

        String foto = scanner.nextLine();


        double price = 0;
        double all = 0;


        if(etap.equals("Quarter final")){
            switch (typeTicket){


                case "Standard":
                    price = 55.50;
                    all = price * numberOfTicket;

                    if(all > 2500 && all <= 4000){
                        all = all * 0.90;


                    }

                    if(all > 4000){
                        all = all * 0.75;
                        if(foto.equals("Y")){

                            System.out.printf("%.2f", all);
                            break;
                        }

                    }



                    if(foto.equals("Y")){
                        all = (numberOfTicket * 40) + all;
                        System.out.printf("%.2f", all);
                        break;
                    }

                    System.out.printf("%.2f", all);
                    break;

                case "Premium":
                    price = 105.20;
                    all = price * numberOfTicket;

                    if(all > 2500 && all <= 4000){
                        all = all * 0.90;


                    }

                    if(all > 4000){
                        all = all * 0.75;
                        if(foto.equals("Y")){

                            System.out.printf("%.2f", all);
                            break;
                        }

                    }



                    if(foto.equals("Y")){
                        all = (numberOfTicket * 40) + all;
                        System.out.printf("%.2f", all);
                        break;
                    }

                    System.out.printf("%.2f", all);
                    break;

                case "VIP":
                    price = 118.90;
                    all = price * numberOfTicket;

                    if(all > 2500 && all <= 4000){
                        all = all * 0.90;


                    }

                    if(all > 4000){
                        all = all * 0.75;
                        if(foto.equals("Y")){

                            System.out.printf("%.2f", all);
                            break;
                        }

                    }



                    if(foto.equals("Y")){
                        all = (numberOfTicket * 40) + all;
                        System.out.printf("%.2f", all);
                        break;
                    }

                    System.out.printf("%.2f", all);
                    break;


            }

        }

        if(etap.equals("Semi final")){

            switch (typeTicket){

                case "Standard":
                    price = 75.88;
                    all = price * numberOfTicket;

                    if(all > 2500 && all <= 4000){
                        all = all * 0.90;


                    }
                    if(all > 4000){
                        all = all * 0.75;
                        if(foto.equals("Y")){

                            System.out.printf("%.2f", all);
                            break;
                        }

                    }



                    if(foto.equals("Y")){
                        all = (numberOfTicket * 40) + all;
                        System.out.printf("%.2f", all);
                        break;
                    }

                    System.out.printf("%.2f", all);
                    break;

                case "Premium":
                    price = 125.22;
                    all = price * numberOfTicket;

                    if(all > 2500 && all <= 4000){
                        all = all * 0.90;


                    }

                    if(all > 4000){
                        all = all * 0.75;
                        if(foto.equals("Y")){

                            System.out.printf("%.2f", all);
                            break;
                        }

                    }



                    if(foto.equals("Y")){
                        all = (numberOfTicket * 40) + all;
                        System.out.printf("%.2f", all);
                        break;
                    }

                    System.out.printf("%.2f", all);
                    break;

                case "VIP":
                    price = 300.40;
                    all = price * numberOfTicket;

                    if(all > 2500 && all <= 4000){
                        all = all * 0.90;


                    }

                    if(all > 4000){
                        all = all * 0.75;
                        if(foto.equals("Y")){

                            System.out.printf("%.2f", all);
                            break;
                        }

                    }



                    if(foto.equals("Y")){
                        all = (numberOfTicket * 40) + all;
                        System.out.printf("%.2f", all);
                        break;
                    }

                    System.out.printf("%.2f", all);
                    break;


            }

        }


        if(etap.equals("Final")){
            switch (typeTicket){


                case "Standard":
                    price = 110.10;
                    all = price * numberOfTicket;

                    if(all > 2500 && all <= 4000){
                        all = all * 0.90;


                    }
                    if(all > 4000){
                        all = all * 0.75;
                        if(foto.equals("Y")){

                            System.out.printf("%.2f", all);
                            break;
                        }

                    }



                    if(foto.equals("Y")){
                        all = (numberOfTicket * 40) + all;
                        System.out.printf("%.2f", all);
                        break;
                    }

                    System.out.printf("%.2f", all);
                    break;

                case "Premium":
                    price = 160.66;
                    all = price * numberOfTicket;

                    if(all > 2500 && all <= 4000){
                        all = all * 0.90;


                    }

                    if(all > 4000){
                        all = all * 0.75;
                        if(foto.equals("Y")){

                            System.out.printf("%.2f", all);
                            break;
                        }

                    }



                    if(foto.equals("Y")){
                        all = (numberOfTicket * 40) + all;
                        System.out.printf("%.2f", all);
                        break;
                    }

                    System.out.printf("%.2f", all);
                    break;

                case "VIP":
                    price = 400;
                    all = price * numberOfTicket;

                    if(all > 2500 && all <= 4000){
                        all = all * 0.90;


                    }

                    if(all > 4000){
                        all = all * 0.75;
                        if(foto.equals("Y")){

                            System.out.printf("%.2f", all);
                            break;
                        }

                    }



                    if(foto.equals("Y")){
                        all = (numberOfTicket * 40) + all;
                        System.out.printf("%.2f", all);
                        break;
                    }

                    System.out.printf("%.2f", all);
                    break;


            }



        }
    }
}
