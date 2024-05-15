import java.util.Scanner;
public class week3_QN_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu and prompt user for choice
        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Declare variables to store dimensions and area
        double area = 0.0;

        // Calculate area based on user's choice using switch case
        switch (choice) {
            case 1: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                break;
            case 2: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                break;
            case 3: // Square
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                area = side * side;
                break;
            case 4: // Triangle
                System.out.print("Enter the base length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                scanner.close();
                return;
        }

        // Display the calculated area
        System.out.println("Thee area of the chosen shape is: " + area);

        scanner.close();
    }
    
}