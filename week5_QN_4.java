import java.util.Scanner;

public class week5_QN_4 {
    
    public static int multiply(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Call the multiply method and print the result
        int result = multiply(num1, num2, num3);
        System.out.println("The result of multiplying " + num1 + ", " + num2 + ", and " + num3 + " is: " + result);
        
        scanner.close();
    }
}
