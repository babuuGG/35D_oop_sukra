
import java.util.Scanner;

public class week3_QN_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the number:");
        int NUM = scanner.nextInt();
        if(NUM < 0){
            System.out.println("The number is negative");
        }if(NUM==0){
            System.out.println("the number is zero");
        }if(NUM>0){
            System.out.println("the number is positive");
        }
        scanner.close();
    }    
}
