import java.util.Scanner;

public class week2_QN_3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // area of triangle
        System.out.println("app to calculate the area of triangle and voulume of cube and cubiod");
        System.out.println("enter the base and height of the traingle");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double Area_Traingle = 0.5* base * height;
        System.out.println("area of the traingle is:" + Area_Traingle);

        //volume of cube
        System.out.println("enter the side length of the cube:");
        double sideofCube = scanner.nextDouble();
        double Cube_volume = Math.pow(sideofCube,3);
        System.out.println("Volume of the cube:" + Cube_volume);
        
        // volume of cubiod
        System.out.println("Enter the length , width and height of the cuboid:");
        double lengthh = scanner.nextDouble();
        double heighht = scanner.nextDouble();
        double breadth_ = scanner.nextDouble();
        double cuboid_vOL = lengthh * heighht * breadth_;
        System.out.println("volume of the cubiod is:" + cuboid_vOL);
    }   
}
