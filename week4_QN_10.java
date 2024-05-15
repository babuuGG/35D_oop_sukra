import java.util.Scanner;

public class week4_QN_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive non-zero integer: ");
        int number = scanner.nextInt();
        
        // Validate input
        while (number <= 0) {
            System.out.print("Please enter a positive non-zero integer: ");
            number = scanner.nextInt();
        }
        
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        
        System.out.println("The sum of all integers from 1 to " + number + " is: " + sum);
        
        scanner.close();
    }
}
