import java.util.Scanner;

public class RectanglePerimeter {

    public static void main(String[] args) {

        //Taking Input of length and width
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle : ");
        float length = sc.nextFloat();
        System.out.print("Enter width of Rectangle : ");
        float width = sc.nextFloat();

        //Calculating Perimeter
        float perimeter = 2 * (length + width);

        //printing perimeter of rectangle
        System.out.println("perimeter of rectangle: " + perimeter);
    }
}
