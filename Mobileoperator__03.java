import java.util.Scanner;

public class Mobileoperator__03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String timeContract = scanner.nextLine();
        String typeOfContract = scanner.nextLine();
        String internet = scanner.nextLine();
        double month = Double.parseDouble(scanner.nextLine());



        double smallOne = 9.98;
        double middleOne = 18.99;
        double largeOne = 25.98;
        double extraLargeOne = 35.99;


        double smallTwo = 8.58;
        double middleTwo = 17.09;
        double largeTwo = 23.59;
        double extraLargeTwo = 31.79;

        double finalPrice = 0;
        double discountTwo = 0;

        if(timeContract.equals("one")){



            switch (typeOfContract){

                case "Small":
                    if(internet.equals("yes")){
                        smallOne = smallOne + 5.50;

                    }
                   finalPrice = smallOne * month;
                    System.out.printf("%.2f lv.", finalPrice);
                    break;

                case "Middle":
                    if(internet.equals("yes")){
                        middleOne = middleOne + 4.35;

                    }
                    finalPrice = middleOne * month;
                    System.out.printf("%.2f lv.", finalPrice);
                    break;

                    case "Large":
                        if(internet.equals("yes")){
                            largeOne = largeOne + 4.35;

                        }
                        finalPrice = largeOne * month;
                        System.out.printf("%.2f lv.", finalPrice);
                        break;

                case "ExtraLarge":
                    if(internet.equals("yes")){
                        extraLargeOne = extraLargeOne + 3.85;
                    }
                    finalPrice = extraLargeOne * month;
                    System.out.printf("%.2f lv.", finalPrice);
                    break;



            }



        } if(timeContract.equals("two")){

            switch (typeOfContract){

                case "Small":
                    if(internet.equals("yes")){
                        smallTwo = smallTwo + 5.50;


                    }
                    finalPrice = smallTwo * month;
                    discountTwo = (finalPrice / 100) * 3.75;
                    finalPrice = finalPrice - discountTwo;
                    System.out.printf("%.2f lv.", finalPrice);
                    break;

                case "Middle":
                    if(internet.equals("yes")){
                        middleTwo = middleTwo + 4.35;

                    }
                    finalPrice = middleTwo * month;
                    discountTwo = (finalPrice / 100) * 3.75;
                    finalPrice = finalPrice - discountTwo;
                    System.out.printf("%.2f lv.", finalPrice);
                    break;

                case "Large":
                    if(internet.equals("yes")){
                        largeTwo = largeTwo + 4.35;

                    }
                    finalPrice = largeTwo * month;
                    discountTwo = (finalPrice / 100) * 3.75;
                    finalPrice = finalPrice - discountTwo;
                    System.out.printf("%.2f lv.", finalPrice);
                    break;

                case "ExtraLarge":
                    if(internet.equals("yes")){
                        extraLargeTwo = extraLargeTwo + 3.85;
                    }
                    finalPrice = extraLargeTwo * month;
                    discountTwo = (finalPrice / 100) * 3.75;
                    finalPrice = finalPrice - discountTwo;
                    System.out.printf("%.2f lv.", finalPrice);
                    break;



            }

        }


    }
}
