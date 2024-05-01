import java.util.Scanner;

public class week2_QN_2 {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the principle amount");
        int principle = scanner.nextInt();
        System.out.println("enter the rate:");
        int rate = scanner.nextInt();
        System.out.println("enter the time:");
        int time = scanner.nextInt();
        int SI = (principle*rate*time)/100 ;
        System.out.println(SI);
        scanner.close();

    
}
