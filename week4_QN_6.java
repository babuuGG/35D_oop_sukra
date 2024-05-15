import java.util.Scanner;
public class week4_QN_6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the width of the traingle");
    int width = scanner.nextInt();

    for(int i=1;i<=width;i++){
        for(int j=1;j<=i;j++){
            System.out.println("*");

        }
    System.out.println();
    }
    scanner.close();
}
}
