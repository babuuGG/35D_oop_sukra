import java.util.Scanner;
public class week5_QN_2 {
    public static boolean isEven(int n){
        return n%2 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println(number + " is the even number");
        scanner.close();
    }
}
