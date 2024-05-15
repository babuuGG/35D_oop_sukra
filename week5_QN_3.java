import java.util.Scanner;
public class week5_QN_3 {
    public static void printTable(int n){
        System.out.println("multiplication table of " + n + ":");
        for(int i=1;i<=10;i++){
            System.out.println(n + " x" + i + " = " + (n*i));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        printTable(number);
        scanner.close();
    }
}
