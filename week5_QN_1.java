import java.util.Scanner;
public class week5_QN_1 {
    public static boolean isPrime(int number){
        if(number <=1){
            return false;
        }
        for(int i = 2; i * i <=number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if(isPrime(number)){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is not a prime number:");
        }
        scanner.close();
    }
}