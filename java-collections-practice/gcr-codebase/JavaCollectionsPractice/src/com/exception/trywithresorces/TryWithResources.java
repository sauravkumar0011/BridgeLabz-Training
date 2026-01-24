package com.exception.trywithresorces;

import java.io.*;

public class TryWithResources {

	public static void main(String[] args) {

		try(FileReader fr = new FileReader("C:\\Users\\saura\\OneDrive\\Desktop\\New Text Document.txt");
			BufferedReader bf = new BufferedReader(fr))
		{
			String line;
			while((line = bf.readLine()) != null)
			{
				System.out.print(line);
			}
		}catch(IOException e) {
			System.out.println("Error reading file");
		}
		
	}
}

