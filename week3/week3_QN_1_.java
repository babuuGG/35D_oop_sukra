
package week3;
import java.util.Scanner;
public class week3_QN_1_ {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // taking three numbers
        System.out.println("enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("enter the second number:");
        int num2 = scanner.nextInt();
        System.out.println("enter the third number:");
        int num3 = scanner.nextInt();

        int max = num1;
        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }

        System.out.println("maximum number is :" + max);
        scanner.close();
    }
}
