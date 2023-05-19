import java.util.Scanner;

public class MainDay8citydefence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Target row: ");
        int row = input.nextInt();
        System.out.print("Targer Column: ");
        int column = input.nextInt();

        Day8CityDefence positionCalculator = new Day8CityDefence(row, column);
        String position1 = positionCalculator.stringPosition1(1);
        String position2 = positionCalculator.stringPosition2(1);
        String position3 = positionCalculator.stringPosition3(1);
        String position4 = positionCalculator.stringPosition4(1);

        System.out.println("Deploy to position: ");
        System.out.println(position1);
        System.out.println(position2);
        System.out.println(position3);
        System.out.println(position4);

        input.close();
    }
}
