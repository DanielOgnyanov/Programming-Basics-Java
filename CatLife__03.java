import java.util.Scanner;

public class CatLife__03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        String sex = scanner.nextLine();

        int catMo = 0;



        if (type.equals("British Shorthair")){
            switch (sex){

                case "m":
                    catMo = (13 * 12) / 6;
                    System.out.printf("%d cat months", catMo);
                    break;

                case "f":
                    catMo = (14 * 12) / 6;
                    System.out.printf("%d cat months", catMo);
                    break;

            }

        }

        if (type.equals("Siamese")){
            switch (sex){

                case "m":
                    catMo = (15 * 12) / 6;
                    System.out.printf("%d cat months", catMo);
                    break;

                case "f":
                    catMo = (16 * 12) / 6;
                    System.out.printf("%d cat months", catMo);
                    break;
            }

        }
        if (type.equals("Persian")){
            switch (sex){
                case "m":
                    catMo = (14 * 12) / 6;
                    System.out.printf("%d cat months", catMo);
                    break;

                case "f":
                    catMo = (15 * 12) / 6;
                    System.out.printf("%d cat months", catMo);
                    break;
            }

        }

        if (type.equals("Ragdoll")){
            switch (sex){
                case "m":
                    catMo = (16 * 12) / 6;
                    System.out.printf("%d cat months", catMo);
                    break;

                case "f":
                    catMo = (17 * 12) / 6;
                    System.out.printf("%d cat months", catMo);
                    break;
            }

        }

        if (type.equals("American Shorthair")){
            switch (sex){
                case "m":
                    catMo = (12 * 12) / 6;
                    System.out.printf("%d cat months", catMo);
                    break;

                case "f":
                    catMo = (13 * 12) / 6;
                    System.out.printf("%d cat months", catMo);
                    break;
            }

        }

        if (type.equals("Siberian")){
            switch (sex){
                case "m":
                    catMo = (11 * 12) / 6;
                    System.out.printf("%d cat months", catMo);
                    break;

                case "f":
                    catMo = (12 * 12) / 6;
                    System.out.printf("%d cat months", catMo);
                    break;
            }

        }

        if(!type.equals("British Shorthair") && !type.equals("Siamese") && !type.equals("Persian") && !type.equals("Ragdoll")
        && !type.equals("American Shorthair") && !type.equals("Siberian")){
            System.out.printf("%s is invalid cat!", type);

        }


    }
}
