import java.util.Scanner;
public class week4_QN_7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("enter the second number:");
        int num2 = scanner.nextInt();

        int hcf = calculateHCF(num1,num2);
        System.out.println("The hcf of" + num1 + "and" + num2 + "is" + hcf);
        scanner.close();
    }
    //function to calculate HCF
    public static int calculateHCF(int a , int b){
        if(b == 0 ){
            return a;
        }else {
            return calculateHCF(b, a % b);
        }
    }
}