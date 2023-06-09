package oldStuff;

import java.util.Scanner;

public class MainDay7Kingdom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculating the value of your kingdom.");

        System.out.print("How many estates does your kingdom have?\nEstates: ");
        int estates = input.nextInt();

        System.out.print("How many Duchys does your kingdom have?\nDuchys: ");
        int duchys = input.nextInt();

        System.out.print("How many provinces does your kingdom have?\nProvinces: ");
        int provinces = input.nextInt();

        Day7KingdomPoints kingdomPoints = new Day7KingdomPoints(estates, duchys, provinces);
        int kingdomValue = kingdomPoints.addUpKingdomPoints();

        System.out.println("You kingdom has " + kingdomValue + " points.");

        input.close();
    }
}