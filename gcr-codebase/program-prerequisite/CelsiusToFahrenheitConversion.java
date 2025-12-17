import java.util.Scanner;

public class CelsiusToFahrenheitConversion
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float temperatureInCelcius = sc.nextFloat();

        float temperatureInFahrenheit = (temperatureInCelcius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is " + temperatureInFahrenheit);
    }
}
