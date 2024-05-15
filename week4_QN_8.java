import java.util.Scanner;
public class week4_QN_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        int reversed_number = reverse(num);

        System.out.println("the numebr with reversed digits is " + reversed_number);
        scanner.close();
    }
    public static int reverse(int num){
        int reversed_number = 0;
        while(num!=0){
            int digit = num % 10;
            reversed_number = reversed_number * 10 + digit;
            num /= 10;
        }
        return reversed_number;
    }
    
}
