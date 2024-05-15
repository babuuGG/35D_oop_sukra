import java.util.Scanner;
public class week4_QN_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the square:");
        int width = scanner.nextInt();
        for(int i = 0; i < width;i++){
            for(int j=0;j<width;j++){
                System.out.println("*");
            }
            System.out.println();
        }
        scanner.close();
    }    
}
