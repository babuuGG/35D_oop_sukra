import java.util.Scanner;

public class week3_QN_7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter the grade:");
            char grade = scanner.next().toUpperCase().charAt(0);
            double gpa;
            switch(grade){
                case 'A':
                    gpa = 4;
                    break;
                case 'B':
                    gpa =3;
                    break;
                case 'C':
                    gpa = 2;
                    break;
                case 'D':
                    gpa = 1;
                    break;
                case 'F':
                    gpa = 0;
                    break;
                default:
                    System.out.println("invalid grade entered:");
                    scanner.close();
                    return;
            }
            System.out.println("The GPA equivalent of grade" + grade + "is" + gpa);
            scanner.close();
        }
}
