import java.util.Scanner;
public class week2_QN_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Age:");
        int age = scanner.nextInt();

        String message = (age>=18) ? " u r eligilbe to casta  vote" : "sorry , u r not eligible";
        System.out.println(message);
        scanner.close();
    }
}
