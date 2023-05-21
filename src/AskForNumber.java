import java.util.Scanner;


public class AskForNumber {

    private static Scanner input = new Scanner(System.in);

    public static int askForNumber(String text) {
        System.out.println(text);
        String userInput = input.nextLine();
        return Integer.parseInt(userInput);
    }

    public static int askForNumberInRange(String text, int min, int max) {
        int number;
        do {number = askForNumber(text);
        }
        while(number < min || number > max);
        
        return number;
    }
}