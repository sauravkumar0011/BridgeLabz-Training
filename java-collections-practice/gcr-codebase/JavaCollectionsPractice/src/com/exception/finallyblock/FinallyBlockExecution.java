package com.exception.finallyblock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockExecution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("Enter dividend number");
		int dividend= sc.nextInt();
		
		System.out.println("Enter divisor number");
		int divisor= sc.nextInt();
		
		System.out.println("Result: " + (dividend/divisor));
		
		}catch(ArithmeticException e) {
			System.out.println("Not divisible");
		}catch(InputMismatchException e) {
			System.out.println("Enter valid input");
		}finally {
			System.out.println("Operation completed");
		}
	}

}
