import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        
        String name = "";

        Scanner reader = new Scanner(System.in);

        System.out.println("Bread is ready.");
        System.out.println("Who is the bread for?");

        name = reader.next();

        System.out.println("Noted: " + name + " got bread.");

        reader.close();
    }
}
