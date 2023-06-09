package oldStuff;

import java.util.Scanner;

public class MainDay6FourSisters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many eggs have been gathered today?\nAmount: ");
        int eggAmount = input.nextInt();

        ChocEggCalculator splitEggs = new ChocEggCalculator(eggAmount);
        int eggsForDuckbear;
        int eggsForEachSister;
        eggsForDuckbear = splitEggs.splittingEggsForDuckbear();
        eggsForEachSister = splitEggs.splittingEggsForEachSister();

        System.out.println("Each sister gets " + eggsForEachSister);
        System.out.println("The duckbear gets " + eggsForDuckbear + " eggs.");

        input.close();
    }
}
