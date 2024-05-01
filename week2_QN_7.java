import java.util.Scanner;
public class week2_QN_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter ur name:");
        String NAME = scanner.nextLine();
        System.out.println("enter the roll number:");
        int ROLL = scanner.nextInt();
        System.out.println("enter the name of Field:");
        String INTEREST = scanner.nextLine();
        
        System.out.println("hey, my name is " + NAME + "and my roll number is" + ROLL + "My field of interest is:" + INTEREST );
       scanner.close(); 
    }

    
}
