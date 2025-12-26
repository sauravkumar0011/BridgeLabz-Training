package com.classandobject.levelone;

public class ComputeAreaOfCircle {

	double radius;
	
	ComputeAreaOfCircle(double radius){
		this.radius = radius;
	}
	
	//Calculate and display Area of circle
	public void areaOfCircle(){
		System.out.printf("Area of circle is : ",(Math.PI*radius*radius));
	}
	
	//Calculate display circumference of circle
	public void circumferenceCircle() {
		System.out.printf("\nCircumference of circle: %.4f ",(2*Math.PI*radius));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeAreaOfCircle circle = new ComputeAreaOfCircle(5.2);
		circle.areaOfCircle();
		circle.circumferenceCircle();
	}

}
