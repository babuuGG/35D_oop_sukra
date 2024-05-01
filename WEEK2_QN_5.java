import java.util.Scanner;
public class WEEK2_QN_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number:");
        int first = scanner.nextInt();
        System.out.println("enter the second number:");
        int second = scanner.nextInt();
        int SUM = first + second ;
        System.out.println("The sum is " + SUM);
        int PRO = first * second ;
        System.out.println("THe product is :" + PRO);
        scanner.close();
    }    
}
