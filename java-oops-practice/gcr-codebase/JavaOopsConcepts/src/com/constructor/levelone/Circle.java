package com.constructor.levelone;
import java.util.*;

public class Circle {

	public double radius;
	
	Circle(){
		radius =10;
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius of circle: ");
		double r = sc.nextDouble();
		
		Circle c;
		
		if(r<=0) {
			c = new Circle(); 
		}
		else {
			c = new Circle(r);
		}
		
		System.out.println("Radius of circle is: "+ c.radius);

		sc.close();
	}
}
