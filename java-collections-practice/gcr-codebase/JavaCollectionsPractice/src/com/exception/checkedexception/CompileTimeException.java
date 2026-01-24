package com.exception.checkedexception;

import java.io.*;

public class CompileTimeException {

	public static void main(String[] args) {

		try(FileInputStream fis = new FileInputStream("C:\\Users\\saura\\OneDrive\\Desktop\\New Text Document.txt");)
		{
			int bytes;
			while((bytes = fis.read()) != -1)
			{
				System.out.print((char)bytes);
			}
		}catch(IOException e) {
			System.out.println("File not found");
		}
		
	}

}
