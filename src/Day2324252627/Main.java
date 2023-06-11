package Day2324252627;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(2, 3);
        Point point2 = new Point(-4, 0);
        Point point3 = new Point();
        Point point4 = new Point();

        point1.printCoordinates();
        point2.printCoordinates();
        point3.printCoordinates();
        point4.printCoordinates();
        point3.setXCoordinate(7);
        point3.printCoordinates();
        point3.setYCoordinate(2);
        point3.printCoordinates();
        point3.setXAndYCoordinates(1, 3);
        point3.printCoordinates();

        Color red = new Color("Red");
        red.showRGBValues();
        red.listCommonColors();

        for (colorEnum color : colorEnum.values()) {
            for (rankEnum rank : rankEnum.values()) {
                Card card = new Card(color, rank);
                System.out.println("The " + card.getColor() + " " + card.getRank());
                
            }
        }

        Door door1 = new Door(doorStateEnum.OPEN, 123456789);
        door1.closeDoor();
        door1.lockDoor();
        door1.unlockDoor(123);
        door1.unlockDoor(123456789);
        door1.unlockDoor(123456789);
    }

}
