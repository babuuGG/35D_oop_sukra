import java.util.Scanner;
public class week3_QN_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number:");
        int NUM = scanner.nextInt();
        if(NUM % 2 ==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd:");
        }
        scanner.close();
    
    }
}
