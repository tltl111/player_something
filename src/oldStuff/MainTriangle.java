package oldStuff;

import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the base of the triangle?\nBase: ");
        double triangleBase = input.nextDouble();

        System.out.print("What is the height of the triangle?\nHeight: ");
        double triangleHeight = input.nextDouble();

        CalculateTriangleArea triangleArea = new CalculateTriangleArea(triangleBase, triangleHeight);
        double triangleSize = triangleArea.calculateArea();
        System.out.println("The area of the triangle is: " + triangleSize);

        input.close();
    }
}