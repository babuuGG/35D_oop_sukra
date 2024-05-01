import java.util.Scanner;
public class week2_QN_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double length  = scanner.nextDouble();

        System.out.println("enter the breadth of the rectangle:");
        double breadth = scanner.nextDouble();

        double area = length * breadth;

        //into int
        int areaINT = (int)area;

        System.out.println("area of rectanle(into int):" + areaINT);

        scanner.close();
    }
    
}
