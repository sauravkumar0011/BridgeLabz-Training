import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Cylinder :");
        double radius = sc.nextFloat();
        System.out.println("Enter height of Cylinder :");
        double height = sc.nextFloat();

        double volume = 3.14 * radius * radius * height;
        System.out.println("Volume of Cylinder is : " + volume);

    }
}
