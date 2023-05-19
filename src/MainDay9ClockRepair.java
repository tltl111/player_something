import java.util.Scanner;

public class MainDay9ClockRepair {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {

            while(true) {

                System.out.print("Input a number: ");
                int number = input.nextInt();

                if (number % 2 == 0) {
                    String tick = Day9ClockRepair.displayTick();
                    System.out.println(tick);
                } else {
                    String tock = Day9ClockRepair.displayTock();
                    System.out.println(tock);
                }
            }
        }
    }
}
