import java.util.Scanner;

public class week4_QN_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countGreaterThan50 = 0;
        int countLessThan50 = 0;
        int countEqualTo50 = 0;
        int sumGreaterThan50 = 0;
        int sumLessThan50 = 0;
        
        System.out.println("Enter ten integer numbers:");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            
            if (number > 50) {
                countGreaterThan50++;
                sumGreaterThan50 += number;
            } else if (number < 50) {
                countLessThan50++;
                sumLessThan50 += number;
            } else {
                countEqualTo50++;
            }
        }
        
        System.out.println("Number of inputs greater than 50: " + countGreaterThan50);
        System.out.println("Number of inputs less than 50: " + countLessThan50);
        System.out.println("Number of inputs equal to 50: " + countEqualTo50);
        
        if (countGreaterThan50 > 0) {
            double averageGreaterThan50 = (double) sumGreaterThan50 / countGreaterThan50;
            System.out.println("Average of numbers greater than 50: " + averageGreaterThan50);
        } else {
            System.out.println("No numbers greater than 50 to calculate average.");
        }
        
        if (countLessThan50 > 0) {
            double averageLessThan50 = (double) sumLessThan50 / countLessThan50;
            System.out.println("Average of numbers less than 50: " + averageLessThan50);
        } else {
            System.out.println("No numbers less than 50 to calculate average.");
        }
        
        scanner.close();
    }
}
