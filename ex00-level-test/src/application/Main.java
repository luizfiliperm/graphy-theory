package application;

import entities.distance.Point;
import services.DistanceCalculatorService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        app(sc);

        sc.close();
    }

    public static void app(Scanner sc){
        int op = selectOption(sc);

        switch (op){
            case 0:
                DistanceApplication.run(sc);
                break;
            case 1:
                System.out.println("You selected option 1");
                break;
            case 2:
                System.out.println("Thanks for using our application!");
                return;
        }
        app(sc);

    }

    public static int selectOption(Scanner sc){
        printTrace();
        System.out.print("""
                    At this application, you can:
                    0 - Mesure the distance between two points in a Cartesian plane
                    1 - Calculate area and Perimeter of different shapes
                    2 - Leave
                """);

        System.out.print("Enter your option: ");
        int option =  sc.nextInt();
        printTrace();
        if(option < 0 || option > 2){
            System.out.println("Invalid option, please try again");
            return selectOption(sc);
        }

        return option;
    }

    public static void printTrace(){
        System.out.println("==========================================================");
    }


}