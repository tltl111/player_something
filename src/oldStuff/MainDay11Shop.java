package oldStuff;

import java.util.Scanner;

public class MainDay11Shop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Day11ShopInventory inventory = new Day11ShopInventory(
                10,
                15,
                25,
                1,
                20,
                200,
                1);

        System.out.println("Menu:");
        System.out.println("1. Rope");
        System.out.println("2. Torches");
        System.out.println("3. Climbing Equipment");
        System.out.println("4. Clean Water");
        System.out.println("5. Machette");
        System.out.println("6. Canoe");
        System.out.println("7. Food Supplies");
        System.out.println("What do you want to see the price of?");
        System.out.print("Choice: ");
        int choice = input.nextInt();
        System.out.print("What is your name? ");
        String name = input.next();

        if (name.equals("Tom")) {
            double priceOfItem = inventory.displayPrice(choice) / 2.0;
            System.out.print("The price is " + priceOfItem);
        } else {
            int priceOfItem = inventory.displayPrice(choice);
            System.out.print("The price is " + priceOfItem);
        }

        input.close();
    }
}
