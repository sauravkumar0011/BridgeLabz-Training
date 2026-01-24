package com.exception.propagationinmethods;

public class ExecptionPropagation {

	public static void main(String[] args) {

		try {
			method2();
		}catch(ArithmeticException e){
			System.out.println("Handled exception in main");
		}
	}
	
	public static void method1() {
		System.out.println("Method 1 called");
	   double result = 	10/0;
	}
	
	public static void method2() {
		System.out.println("Method 2 called");
		method1();
	}

}
