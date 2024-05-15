import java.util.Scanner;

public class week4_QN_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        
        do {
            System.out.print("Enter a positive non-zero integer: ");
            int n = scanner.nextInt();
            
            // Calculate the sum
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            
            System.out.println("Sum of 1 to " + n + " is " + sum);
            
            System.out.print("Do you want to continue? Enter 'y' for yes or any other character for no: ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        
        scanner.close();
    }
}
