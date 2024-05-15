import java.util.Scanner;
public class week4_QN_1{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter ur name:");
    String name = scanner.nextLine();
    for(int i=0;i<5;i++){
        System.out.println("hello" + name);
    }
    }
}