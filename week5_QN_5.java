import java.util.Scanner;

public class week5_QN_5 {
    
    public static void calculateSimpleInterest(double principal, double rate, double time) {
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input principal amount, rate, and time from the user
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();
        
        // Call the calculateSimpleInterest method and print the result
        System.out.println("Calculating Simple Interest...");
        calculateSimpleInterest(principal, rate, time);
        
        scanner.close();
    }
}
