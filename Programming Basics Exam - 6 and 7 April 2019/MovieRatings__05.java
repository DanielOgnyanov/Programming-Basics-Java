import java.util.Scanner;

public class MovieRatings__05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfFilm = Integer.parseInt(scanner.nextLine());

        double sumRating = 0;


        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;
        double max = 0;
        double min = 0;

        String filmMax = "";
        String filmMin = "";





        for(int i = 1; i <= numbersOfFilm;i++){

            String nameFilm = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());


            sumRating += rating;

            double averageRating = sumRating / numbersOfFilm;



            if(rating > maxRating){
                maxRating =  rating;
                filmMax = nameFilm;



            }

            if(rating < minRating){
                minRating =  rating;
                filmMin = nameFilm;


            }


            if(i >= numbersOfFilm){
                System.out.printf("%s is with highest rating: %.1f", filmMax , maxRating);
                System.out.println();
                System.out.printf("%s is with lowest rating: %.1f", filmMin, minRating);
                System.out.println();
                System.out.printf("Average rating: %.1f", averageRating);
            }



        }


    }
}
