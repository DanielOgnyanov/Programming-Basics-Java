import java.util.Scanner;

public class PCGameShop__05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int game = Integer.parseInt(scanner.nextLine());

        double hearthstone = 0;
        double fornite = 0;
        double overwatch = 0;
        double others = 0;

        double hearthstoneProcent = 0;
        double forniteProcent = 0;
        double overwatchProcent = 0;
        double othersProcent = 0;

        for(int i = 1; i <= game; i++){

            String nameGameCurrent = scanner.nextLine();


            if(nameGameCurrent.equals("Hearthstone")){
                hearthstone++;

            }

            if(nameGameCurrent.equals("Fornite")){
                fornite++;

            }

            if(nameGameCurrent.equals("Overwatch")){
                overwatch++;

            }

            if(!nameGameCurrent.equals("Overwatch") && !nameGameCurrent.equals("Fornite") &&
                    !nameGameCurrent.equals("Hearthstone")){

                others++;

            }




        }

        hearthstoneProcent = hearthstone / game * 100;
        forniteProcent = fornite / game * 100;
        overwatchProcent = overwatch / game * 100;
        othersProcent = others / game * 100;

        System.out.printf("Hearthstone - %.2f%%", hearthstoneProcent);
        System.out.println();
        System.out.printf("Fornite - %.2f%%", forniteProcent);
        System.out.println();
        System.out.printf("Overwatch - %.2f%%", overwatchProcent);
        System.out.println();
        System.out.printf("Others - %.2f%%", othersProcent);



    }
}
