import java.util.Scanner;

public class Gymnastics__03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String object = scanner.nextLine();

        double difficult = 0;
        double doing = 0;
        double all = 0;
        double diff = 0;
        double Procent = 0;

        if(country.equals("Russia")){

            switch (object){

                case "ribbon":
                    difficult = 9.100;
                    doing = 9.400;
                    all = difficult + doing;
                    diff = 20 - all;
                    Procent = (diff / 20) * 100;
                    System.out.printf("The team of %s get %.3f on %s.", country, all,object);
                    System.out.println();
                    System.out.printf("%.2f%%", Procent);
                    break;

                case "hoop":
                    difficult = 9.300;
                    doing = 9.800;
                    all = difficult + doing;
                    diff = 20 - all;
                    Procent = (diff / 20) * 100;
                    System.out.printf("The team of %s get %.3f on %s.", country, all,object);
                    System.out.println();
                    System.out.printf("%.2f%%", Procent);
                    break;

                case "rope":
                    difficult = 9.600;
                    doing = 9.000;
                    all = difficult + doing;
                    diff = 20 - all;
                    Procent = (diff / 20) * 100;
                    System.out.printf("The team of %s get %.3f on %s.", country, all,object);
                    System.out.println();
                    System.out.printf("%.2f%%", Procent);
                    break;


            }

        }


        if(country.equals("Bulgaria")){


            switch (object){

                case "ribbon":
                    difficult = 9.600;
                    doing = 9.400;
                    all = difficult + doing;
                    diff = 20 - all;
                    Procent = (diff / 20) * 100;
                    System.out.printf("The team of %s get %.3f on %s.", country, all,object);
                    System.out.println();
                    System.out.printf("%.2f%%", Procent);
                    break;

                case "hoop":
                    difficult = 9.550;
                    doing = 9.750;
                    all = difficult + doing;
                    diff = 20 - all;
                    Procent = (diff / 20) * 100;
                    System.out.printf("The team of %s get %.3f on %s.", country, all,object);
                    System.out.println();
                    System.out.printf("%.2f%%", Procent);
                    break;

                case "rope":
                    difficult = 9.500;
                    doing = 9.400;
                    all = difficult + doing;
                    diff = 20 - all;
                    Procent = (diff / 20) * 100;
                    System.out.printf("The team of %s get %.3f on %s.", country, all,object);
                    System.out.println();
                    System.out.printf("%.2f%%", Procent);
                    break;
            }

        }


        if(country.equals("Italy")){

            switch (object){
                case "ribbon":
                    difficult = 9.200;
                    doing = 9.500;
                    all = difficult + doing;
                    diff = 20 - all;
                    Procent = (diff / 20) * 100;
                    System.out.printf("The team of %s get %.3f on %s.", country, all,object);
                    System.out.println();
                    System.out.printf("%.2f%%", Procent);
                    break;

                case "hoop":
                    difficult = 9.450;
                    doing = 9.350;
                    all = difficult + doing;
                    diff = 20 - all;
                    Procent = (diff / 20) * 100;
                    System.out.printf("The team of %s get %.3f on %s.", country, all,object);
                    System.out.println();
                    System.out.printf("%.2f%%", Procent);
                    break;

                case "rope":
                    difficult = 9.700;
                    doing = 9.150;
                    all = difficult + doing;
                    diff = 20 - all;
                    Procent = (diff / 20) * 100;
                    System.out.printf("The team of %s get %.3f on %s.", country, all,object);
                    System.out.println();
                    System.out.printf("%.2f%%", Procent);
                    break;



            }

        }
    }
}
