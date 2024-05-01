import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class week2_QN_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking input from user
        System.out.println("enter the marks of the English");
        int ENG = scanner.nextInt();
        
        System.out.println("enter the marks of nepali:");
        int NEP = scanner.nextInt();

        System.out.println("enter the marks of math:");
        int matH = scanner.nextInt();

        System.out.println("enter the marks of science:");
        int science = scanner.nextInt();

        double total = (ENG+NEP+matH+science);
        double TOTALL = (total/4) * 100;
        System.out.println("the total percentage is :" + TOTALL);
        String result = (TOTALL >= 70) ? "First Class" :
                        (TOTALL > 59) ? "Upper Second Class" :
                        (TOTALL > 49) ? "Second Class" :
                        (TOTALL > 39) ? "Third Class" :
                        "Fail";

        // Print total marks, percentage, and final result
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + TOTALL);
        System.out.println("Result: " + result);

        scanner.close();
    }    
}
