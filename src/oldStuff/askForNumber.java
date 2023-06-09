package oldStuff;

import java.util.Scanner;

public class askForNumber {
    private static Scanner input = new Scanner(System.in);

    public static int numberInput(String text) {
        System.out.println(text);
        String userInput = input.nextLine();
        return Integer.parseInt(userInput);
    }

    public static int askForNumberInRange(String text, int min, int max) {
        int number;
        do {
            number = numberInput(text);
        } while (number < min || number > max);

        return number;
    }
}