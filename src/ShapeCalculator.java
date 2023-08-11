import java.util.Scanner;
public class ShapeCalculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;
        while (true) {
            System.out.println("\n============== MAIN MENU ===============" +
                    "\n 1. Square Computations " +
                    "\n 2. Rectangle Computations" +
                    "\n 3. Circle Computations" +
                    "\n 4. Ellipse Computations" +
                    "\n 5. Exit");
            System.out.print("\n>> ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n 1. Square Computations ");
                    squareComputations();
                    break;
                case 2:
                    System.out.println("\n 2. Rectangle Computations");
                    rectangleComputations();
                    break;
                case 3:
                    System.out.println("\n 3. Circle Computations");
                    circleComputations();
                    break;
                case 4:
                    System.out.println("\n 4. Ellipse Computations");
                    ellipseComputations();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("INVALID INPUT!!!!");
            }
            if (choice == 5) {
                System.out.println("Exiting Now!!!");
                break;
            }
        }
    }

    private static void squareComputations() {

        Square square = new Square();

        System.out.print("Input the side of the square: ");
        double side = scanner.nextDouble();

        square.setLengthOfSide(side);

        System.out.println("\nThe area is " + square.calculateArea() + " sq. units.");
        System.out.println("The perimeter is " + square.calculatePerimeter() + "units.");
    }

    private static void rectangleComputations() {
        Rectangle rect = new Rectangle();

        System.out.print("Input the length: ");
        double length = scanner.nextDouble();
        System.out.print("Input the width: ");
        double width = scanner.nextDouble();

        rect.setWidth(width);
        rect.setLength(length);

        System.out.println("\nThe area is " + rect.calculateArea() + " sq. units.");
        System.out.println("The perimeter is " + rect.calculatePerimeter() + " units.");
    }
    private static void circleComputations() {
        Circle circ = new Circle();

        System.out.println("Input the Radius: ");
        double radius = scanner.nextDouble();

        circ.setRadius(radius);

        System.out.println("\nThe area is " + circ.calculateArea() + " sq. units.");
        System.out.println("The perimeter is " + circ.calculatePerimeter() + " units.");
    }
    private static void ellipseComputations() {
        Ellipse elli = new Ellipse();

        System.out.println("Input the Major Axis (a): ");
        double majorAxis = scanner.nextDouble();
        System.out.println("Input the Minor Axis (b): ");
        double minorAxis = scanner.nextDouble();

        elli.setMajorAxis(majorAxis);
        elli.setMinorAxis(minorAxis);

        System.out.println("\nThe area is " + elli.calculateArea() + " sq. units.");
        System.out.println("The perimeter is " + elli.calculatePerimeter() + " units.");
    }
}

