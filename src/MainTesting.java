public class MainTesting {
    public static void main(String[] args) {
        int result = AskForNumber.askForNumber("What is the airspeed velocity of an unladen swallow? ");
        System.out.println("You entered: " + result);

        int numberInRange = AskForNumber.askForNumberInRange("Enter a number between 1 and 10: ", 1, 10);
        System.out.println("You entered a number within the range: " + numberInRange);
    }
    
}