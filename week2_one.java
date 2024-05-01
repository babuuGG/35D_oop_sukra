import java.util.Scanner;

public class week2_one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("u r eligible to cast a vote.");
        } else {
            System.out.println("Sorry, u r not eligible");
        }
        scanner.close();
    }

    
}
