import java.util.Scanner;
public class week2_QN_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        // Calculate area and perimeter
        double area = side * side;
        double perimeter = 4 * side;

        // Print the results
        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);

        scanner.close();
    }
}
