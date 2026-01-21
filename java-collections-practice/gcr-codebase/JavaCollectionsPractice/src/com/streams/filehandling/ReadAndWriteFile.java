package com.streams.filehandling;

import java.io.*;

public class ReadAndWriteFile {
	
	public static void main(String[] args){

		try(FileInputStream fis = new FileInputStream("C:\\Users\\saura\\OneDrive\\Desktop\\input.txt");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\saura\\OneDrive\\Desktop\\output.txt"))
		{
			int bytedata;
			while((bytedata = fis.read()) != -1)
			{
				fos.write(bytedata);
			}
			System.out.println("File copied Successfully");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
