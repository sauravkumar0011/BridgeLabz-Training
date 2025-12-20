import java.util.Scanner;

public class CalculateTrigoFunctions {

    //calculate various trigonometric functions
    public double[] calculateTrigonometricFunctions(double angle) {
         double[] temp = new double[3];
         double radians = angle * (3.14/180);
         temp[0] = Math.sin(radians);
         temp[1] = Math.cos(radians);
         temp[2] = Math.tan(radians);

         return temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking Input from user
        System.out.println("Enter angle in degrees: ");
        double angle = input.nextDouble();

        double[] result = new double[3];   
   
        //Calling the function calculateTrigonometricFunctions
        CalculateTrigoFunctions obj = new CalculateTrigoFunctions();
        result = obj.calculateTrigonometricFunctions(angle);
        System.out.println("sine is : " + result[0]);
        System.out.println("cosine is : " + result[1]);
        System.out.println("tangent is : " + result[2]);

        input.close();
    }
}
