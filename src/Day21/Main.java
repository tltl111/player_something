package Day21;

import Functions.askForInput;

public class Main {
    public static void main(String[] args) {
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
    }
}
