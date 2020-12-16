import java.util.Scanner;

public class FitnessCenter__05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());



        int counterBack = 0;
        int counterChest= 0;
        int counterLegs = 0;
        int counterAbs = 0;
        int counterProteinShake = 0;
        int counterProteinBar = 0;
        double counterPeople = 0;
        double counterBuy = 0;



        for (int i = 1; i <= people; i++){
            String thing = scanner.nextLine();


            if(thing.equals("Back")){
                counterBack++;
                counterPeople++;

            } if (thing.equals("Chest")){
                counterChest++;
                counterPeople++;


            } if (thing.equals("Legs")){
                counterLegs++;
                counterPeople++;


            } if (thing.equals("Abs")){
                counterAbs++;
                counterPeople++;


            }if (thing.equals("Protein shake")){
                counterProteinShake++;
                counterBuy++;


            }if (thing.equals("Protein bar")){
                counterProteinBar++;
                counterBuy++;


            }

        }

        double procentPeople = (counterPeople / people) * 100;
        double procentBuy = (counterBuy / people) * 100;

        System.out.printf("%d - back", counterBack);
        System.out.println();
        System.out.printf("%d - chest", counterChest);
        System.out.println();
        System.out.printf("%d - legs", counterLegs);
        System.out.println();
        System.out.printf("%d - abs", counterAbs);
        System.out.println();
        System.out.printf("%d - protein shake", counterProteinShake);
        System.out.println();
        System.out.printf("%d - protein bar", counterProteinBar);
        System.out.println();
        System.out.printf("%.2f%% - work out", procentPeople);
        System.out.println();
        System.out.printf("%.2f%% - protein", procentBuy);
    }
}
