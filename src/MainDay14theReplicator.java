import java.util.Scanner;


public class MainDay14theReplicator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int[] numbers2 = new int[5];

        System.out.println("Input 5 numbers in the terminal.");
        System.out.print("Number 1: ");
        numbers[0] = input.nextInt();
        System.out.print("Number 2: ");
        numbers[1] = input.nextInt();
        System.out.print("Number 3: ");
        numbers[2] = input.nextInt();
        System.out.print("Number 4: ");
        numbers[3] = input.nextInt();
        System.out.print("Number 5: ");
        numbers[4] = input.nextInt();

        for(int i = 0; i < numbers.length; i++) {
            numbers2[i] = numbers[i];
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Array 1: " + numbers[i]);
            System.out.println("Array 2: " + numbers2[i]);
        }

        input.close();
    }
}
