package Day22;

import Day21.Arrow;
import Day21.arrowHead;
import Day21.fletching;
import Functions.askForInput;

public class Main {
    public static void main(String[] args) {
        String choice = askForInput.askForString("Do you want a custom arrow or stock arrow?");
        if (choice.equals("custom")) {
            System.out.println("What kind of arrow head do you want?");
            arrowHead[] enumArrowHeadValues = arrowHead.values();
            for (arrowHead value : enumArrowHeadValues) {
                System.out.println(value);
            }
            String arrowHeadChoice = askForInput.askForString("");

            double shaftLength = askForInput.numberInput("Do you want to arrow to be 60 or 100cm long?");

            System.out.println("What kind of fletching do you want?");
            fletching[] enumFletchingValues = fletching.values();
            for (fletching value : enumFletchingValues) {
                System.out.println(value);
            }
            String fletchingChoice = askForInput.askForString("");

            Arrow newArrow = new Arrow(arrowHeadChoice, fletchingChoice, shaftLength);
            System.out.println(newArrow.getCost());
            System.out.println(newArrow.getArrowHead());
            System.out.println(newArrow.getFletching());
            System.out.println(newArrow.getLength());
        } else {
            String choice2 = askForInput.askForString("Do you want a elite, marksman or beginner arrow?");
            if (choice2.equals("elite")) {
                Arrow newEliteArrow = Arrow.createEliteArrow();
                System.out.println(newEliteArrow.getCost());
                System.out.println(newEliteArrow.getArrowHead());
                System.out.println(newEliteArrow.getFletching());
                System.out.println(newEliteArrow.getLength());
            } else if (choice2.equals("marksman")) {
                Arrow newMarksmanArrow = Arrow.createMarksmanArrow();
                System.out.println(newMarksmanArrow.getCost());
                System.out.println(newMarksmanArrow.getArrowHead());
                System.out.println(newMarksmanArrow.getFletching());
                System.out.println(newMarksmanArrow.getLength());
            } else {
                Arrow newBeginnerArrow = Arrow.createBeginnerArrow();
                System.out.println(newBeginnerArrow.getCost());
                System.out.println(newBeginnerArrow.getArrowHead());
                System.out.println(newBeginnerArrow.getFletching());
                System.out.println(newBeginnerArrow.getLength());
            }
        }
        
    }
}
