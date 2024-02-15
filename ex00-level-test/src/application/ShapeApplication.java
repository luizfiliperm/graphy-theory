package application;

import entities.shapes.*;

import java.util.Scanner;

public class ShapeApplication {

    public static void run(Scanner sc){
        int option = userChoice(sc);

        runShape(sc, option);
    }

    public static int userChoice(Scanner sc){
        Main.printTrace();
        System.out.print("""
                Choose a shape:
                0 - Triangle
                1 - Square
                2 - Rectangle
                3 - Parallelogram
                4 - Diamond
                5 - Trapezium
                6 - Circle
                
                """);

        System.out.print("Your choice: ");
        int option = sc.nextInt();

        if(option < 0 || option > 6){
            System.out.println("Invalid option");
            return userChoice(sc);
        }

        return option;
    }

    public static void runShape(Scanner sc, int option){
        Shape shape = switch (option) {
            case 0 -> triangle(sc);
            case 1 -> square(sc);
            case 2 -> rectangle(sc);
            case 3 -> parallelogram(sc);
            case 4 -> diamond(sc);
            case 5 -> trapezium(sc);
            case 6 -> circle(sc);
            default -> null;
        };

        System.out.printf("The area is: %.2f\n", shape.calculateArea());
        System.out.printf("The perimeter is: %.2f\n", shape.calculatePerimeter());
    }


    public static Shape triangle(Scanner sc){

        System.out.println("Triangle");

        System.out.print("Enter the base: ");
        Double base = sc.nextDouble();

        System.out.print("Enter the height: ");
        Double height = sc.nextDouble();

        System.out.print("Enter the first side: ");
        Double side1 = sc.nextDouble();

        System.out.print("Enter the second side: ");
        Double side2 = sc.nextDouble();

        return new Triangle(base, height, side1, side2);
    }

    public static Shape square(Scanner sc){
        System.out.println("Square");

        System.out.print("Enter the side: ");
        Double side = sc.nextDouble();

        return new Square(side);
    }

    public static Shape rectangle(Scanner sc){
        System.out.println("Rectangle");

        System.out.print("Enter the base: ");
        Double base = sc.nextDouble();

        System.out.print("Enter the height: ");
        Double height = sc.nextDouble();

        return new Rectangle(base, height);
    }

    public static Shape parallelogram(Scanner sc){
        System.out.println("Parallelogram");

        System.out.print("Enter the base: ");
        Double base = sc.nextDouble();

        System.out.print("Enter the height: ");
        Double height = sc.nextDouble();

        System.out.print("Enter the side: ");
        Double side = sc.nextDouble();

        return new Parallelogram(base, height, side);
    }

    public static Shape diamond(Scanner sc){
        System.out.println("Diamond");

        System.out.print("Enter the side: ");
        Double side = sc.nextDouble();

        System.out.print("Enter the bigger diagonal: ");
        Double biggerDiagonal = sc.nextDouble();

        System.out.print("Enter the smaller diagonal: ");
        Double smallerDiagonal = sc.nextDouble();

        return new Diamond(side, biggerDiagonal, smallerDiagonal);
    }

    public static Shape trapezium(Scanner sc){
        System.out.println("Trapezium");

        System.out.print("Enter the bigger base: ");
        Double biggerBase = sc.nextDouble();

        System.out.print("Enter the smaller base: ");
        Double smallerBase = sc.nextDouble();

        System.out.print("Enter the height: ");
        Double height = sc.nextDouble();

        System.out.print("Enter the side1: ");
        Double side1 = sc.nextDouble();

        System.out.print("Enter the side2: ");
        Double side2 = sc.nextDouble();

        return new Trapezium(biggerBase, smallerBase, height, side1, side2);
    }

    public static Shape circle(Scanner sc){
        System.out.println("Circle");

        System.out.print("Enter the radius: ");
        Double radius = sc.nextDouble();

        return new Circle(radius);
    }
}
