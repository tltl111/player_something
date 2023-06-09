package oldStuff;

import java.util.Scanner;

public class MainDay10WatchTower {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What are the coordinates of the enemy?");
        System.out.print("x: ");
        int xCoordinate = input.nextInt();
        System.out.print("y: ");
        int yCoordinate = input.nextInt();

        if (xCoordinate == 0 && yCoordinate == 0) {
            System.out.println("The enemy is here!");
        }

        else if (xCoordinate == 0) {
            if (yCoordinate > 0) {
                System.out.println("The enemy is to the North!");
            } else {
                System.out.println("The enemy is to the South!");
            }
        }

        else if (yCoordinate == 0) {
            if (xCoordinate > 0) {
                System.out.println("The enemy is to the East!");
            } else {
                System.out.println("The enemy is to the West!");
            }
        }

        else if (xCoordinate > 0) {
            if (yCoordinate > 0) {
                System.out.println("The enemy is to the Northeast!");
            } else {
                System.out.println("The enemy is to the Southeast!");
            }
        }

        else if (xCoordinate < 0) {
            if (yCoordinate > 0) {
                System.out.println("The enemy is to the Northwest!");
            } else {
                System.out.println("The enemy is to the Southwest!");
            }
        }

        input.close();

    }

}
