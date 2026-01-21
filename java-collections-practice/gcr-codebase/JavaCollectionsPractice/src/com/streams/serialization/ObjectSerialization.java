package com.streams.serialization;

import java.io.*;

public class ObjectSerialization {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Saurav", "Cs", 12000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\saura\\OneDrive\\Desktop\\New Text Document.txt"))) {
		    oos.writeObject(emp);
		}catch(IOException e) {
			e.getStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\saura\\OneDrive\\Desktop\\New Text Document.txt"))) {
			Employee deserilizedEmp = (Employee) ois.readObject();
			System.out.println("Deserialized object: " + deserilizedEmp);
	    }catch(IOException | ClassNotFoundException e) {
		    e.getStackTrace();
	    }
	}

}
