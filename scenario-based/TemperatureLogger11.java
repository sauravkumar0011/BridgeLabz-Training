/*
Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.

*/
import java.util.*;

public class TemperatureLogger11{
	
	public static double calculatesAverageTemp(double[] temp)
	{
		double average = 0.0;
		for(int i=0; i<7; i++)
		{
			average += temp[i];
		}
		return average/7;
	}
	
	public static double calculatesMaxTemp(double[] temp)
	{
		double max = temp[0];
		for(int i=1; i<7; i++)
		{
			if(temp[i]>max);
			  max = temp[i];
		}
		return max;
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double[] temp = new double[7];
		System.out.println("\nEnter Temperature of 7 days");
		
		for(int i=0; i<7; i++)
		{
			System.out.print("\nEnter Temperature of day " + (i+1) + ": ");
			temp[i] = sc.nextDouble();
		}
		float average =(float) calculatesAverageTemp(temp);
		double maxTemp = calculatesMaxTemp(temp);
		
		System.out.println("\n\t====================================");
		System.out.println("\tAverage Temperature is : " + average);
		System.out.println("\tMaximum Temperature is : " + maxTemp);
		System.out.println("\t====================================");
		
		sc.close();
	}
}