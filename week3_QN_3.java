import java.util.Scanner;

public class week3_QN_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        // Check if the number is divisible by both 5 and 11
        boolean divisibleBy5 = (number % 5 == 0);
        boolean divisibleBy11 = (number % 11 == 0);

        // Check if the number is divisible by both 5 and 11
        if (divisibleBy5 && divisibleBy11) {
            System.out.println(number + " is divisible by both 5 and 11.");
        } else {
            System.out.println(number + " is not divisible by both 5 and 11.");
        }

        scanner.close();
    }
}

    
