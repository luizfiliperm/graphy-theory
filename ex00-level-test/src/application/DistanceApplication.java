package application;

import entities.distance.Point;
import services.DistanceCalculatorService;

import java.util.Scanner;

public class DistanceApplication {

    public static void run(Scanner sc){
        System.out.println("Point A");
        Point pointA = readPoint(sc);

        System.out.println("Point B");
        Point pointB = readPoint(sc);

        DistanceCalculatorService distanceCalculator = new DistanceCalculatorService(pointA, pointB);
        System.out.printf("The distance between A and B is: %.2f\n", distanceCalculator.calculateDistance());
    }

    public static Point readPoint(Scanner sc){
        System.out.print("Enter the value of x: ");
        Double x = sc.nextDouble();

        System.out.print("Enter the value of y: ");
        Double y = sc.nextDouble();

        return new Point(x, y);
    }
}
