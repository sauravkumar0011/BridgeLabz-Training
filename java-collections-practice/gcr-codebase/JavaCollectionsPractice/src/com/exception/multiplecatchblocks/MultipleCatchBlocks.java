package com.exception.multiplecatchblocks;

import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		try {
		int[] arr = new int[5];
		
		for(int i=0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter index: ");
		int index = sc.nextInt();
		
		System.out.println("Value at index "  + index +" is " + arr[index]);

		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Index");
		}catch(NullPointerException e) {
			System.out.println("Array is not initialized!");
		}
		
	}

}
