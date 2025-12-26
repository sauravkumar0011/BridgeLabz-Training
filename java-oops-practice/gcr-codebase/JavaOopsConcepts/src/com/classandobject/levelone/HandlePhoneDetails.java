package com.classandobject.levelone;

public class HandlePhoneDetails {

	String brand;
	String model;
	double price;
	

	HandlePhoneDetails(String brand,String model,double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	//Method to display output
	public void diplayMobile() {
		System.out.println("Brand of mobile: "+brand);
		System.out.println("Model of mobile: "+model);
		System.out.println("Price of mobile: "+price);
		System.out.println("------------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlePhoneDetails mobile1=new HandlePhoneDetails("VIVO","VIVO V29" , 18999);
		HandlePhoneDetails mobile2=new HandlePhoneDetails("ONE PLUS","ONE PLUS nord4",49999);
		HandlePhoneDetails mobile3=new HandlePhoneDetails("APPLE","iphone pro16",76999);
	
	    mobile1.diplayMobile();
	    mobile2.diplayMobile();
	    mobile3.diplayMobile();
	}
}
