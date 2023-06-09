package manticorehunting;

import java.util.Scanner;

public class Day19BoxStuff {

    public enum BoxState {
        OPEN,
        CLOSED,
        LOCKED;

        public BoxState closeBox() {
            if (this == OPEN) {
                return CLOSED;
            } else {
                throw new IllegalStateException("Cannot close the box if it is not open!");
            }
        }

        public BoxState openBox() {
            if (this == CLOSED) {
                return OPEN;
            } else {
                throw new IllegalStateException("Cannot open the box if it is not closed!");
            }
        }

        public BoxState lockBox() {
            if (this == CLOSED) {
                return LOCKED;
            } else {
                throw new IllegalStateException("Cannot lock the box if it is not closed!");
            }
        }

        public BoxState unlockBox() {
            if (this == LOCKED) {
                return CLOSED;
            } else {
                throw new IllegalStateException("Cannot unlock the box if it is not locked!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BoxState boxState = BoxState.OPEN;
        boolean endless = true;

        while (endless) {
            try {
                System.out.println("\nBox state: " + boxState);
                System.out.println("What do you want to do with the box?");
                System.out.print("Close/Open/Unlock/Lock: ");
                String instruction = input.next();

                if (instruction.equals("Close")) {
                    boxState = boxState.closeBox();
                } else if (instruction.equals("Open")) {
                    boxState = boxState.openBox();
                } else if (instruction.equals("Unlock")) {
                    boxState = boxState.unlockBox();
                } else if (instruction.equals("Lock")) {
                    boxState = boxState.lockBox();
                } else {
                    System.out.println("Try again");
                    continue;
                }
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        input.close();

    }
}
