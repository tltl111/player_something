package Functions;

import java.util.Scanner;

public class askForInput {

    private static Scanner input = new Scanner(System.in);

    public static int numberInput(String text) {
        System.out.println(text);
        while (true) {
            try {
                String userInput = input.nextLine();
                return Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        }
    }

    public static int askForNumberInRange(String text, int min, int max) {
        int number;
        do {
            number = numberInput(text);
        } while (number < min || number > max);

        return number;
    }

    public static boolean askForNewGame() {
        System.out.print("Would you like to play again? Yes/No: ");
        String newGame = input.nextLine();
        if (newGame.toLowerCase().equals("yes") || newGame.toLowerCase().equals("y")) {
            boolean startNewGame = true;
            return startNewGame;
        } else {
            boolean startNewGame = false;
            return startNewGame;
        }
    }
}
