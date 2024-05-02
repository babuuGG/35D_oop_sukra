import java.util.Scanner;
public class week3_QN_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("enter the operator:");
        char operator = scanner.next().charAt(0);

        System.out.println("enter the second number:");
        double num2 = scanner.nextDouble();

        double result;

        switch(operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2==0){
                    System.out.println("Error:division by zero.");
                    scanner.close();
                    return;
                }
                result = num1/num2;
                break;
            default:
            System.out.println("invalid operator entered");
            scanner.close();
            return;

        }
        System.out.println("Result:" + num1 + "" + operator + "" + num2 + " = " + result);
        scanner.close();
    }
}
