package com.petpal;

public class PetPalTest {

	public static void main(String[] args) {
		
		Dog d1 = new Dog("Tommy", 2);
		d1.setMoodStatus("Happy");  //Access modifier
		System.out.println(d1.getMoodStatus());
		d1.feed(); 
		d1.play();
		d1.sleep();		
		d1.makeSound(); 
		
		System.out.println("--------------------");
		Pet p1 = new Cat("Lusi", 3);
		p1.makeSound();   //Polymorphism
	}

}
