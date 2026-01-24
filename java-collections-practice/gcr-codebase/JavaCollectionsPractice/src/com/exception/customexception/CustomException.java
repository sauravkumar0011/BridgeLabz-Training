package com.exception.customexception;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args){

		   Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your age");
			int age = sc.nextInt();
			try {
			validateAge(age);
			}catch(InvalidAgeException e) {
				 System.out.println(e.getMessage());
			}
			
			sc.close();
	}
	
	public static void validateAge(int age)
	{
		if(age<18)
			throw new InvalidAgeException("Age must be 18 or above");
		else
			System.out.println("Access granted!");
	}

}
