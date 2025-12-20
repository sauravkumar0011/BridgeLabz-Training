import java.util.Scanner;

public class CalculateTemperature {

    //calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
         double temp = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
     return temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking Input from user
        System.out.println("Enter temperature : ");
        double temperature = input.nextDouble();
        System.out.println("Enter windspeed: ");
        double windSpeed = input.nextDouble();
        
        //Calling the function calculateWindChill
        CalculateTemperature obj = new CalculateTemperature();
        double result = obj.calculateWindChill(temperature, windSpeed);
        System.out.println("The Wind chill temperature is : " + result);

        input.close();
    }
}
