import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String a = input.next();

        System.out.println("How would you describe it? Big? Azure? Tattered?");

        String b = input.next();
        String c = "Doom";
        String d = "3000";

        System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");

        input.close();
    }
}
