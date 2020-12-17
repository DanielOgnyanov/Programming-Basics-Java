import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameSerial = scanner.nextLine();
        double season = Double.parseDouble(scanner.nextLine());
        double episodes = Double.parseDouble(scanner.nextLine());
        double episodesClear = Double.parseDouble(scanner.nextLine());


        double rek = episodesClear / 100 * 20;

        double episodesRek = rek + episodesClear;

        double special = season * 10;

         double all = Math.abs(episodesRek * episodes * season + special);

         int all1 = (int)(all);

        System.out.printf("Total time needed to watch the %s series is %d minutes.", nameSerial , all1);
    }
}
