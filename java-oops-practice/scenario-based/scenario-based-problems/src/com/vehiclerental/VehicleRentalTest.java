package com.vehiclerental;

public class VehicleRentalTest {

	public static void main(String[] args) {
	
		    Rentable bike = new Bike(101, "Honda", 300);
	        Rentable car = new Car(102, "Toyota", 1000);
	        Rentable truck = new Truck(103, "Tata", 2000);

	        Customer c1 = new Customer(1,"Saurav");
	        c1.displayCustomer();
	        System.out.println("Bike Rent (3 days): " + bike.calculateRent(3));
	        System.out.println("---------------------------");

	        Customer c2 = new Customer(2,"Vikash");
	        c2.displayCustomer();
	        System.out.println("Car Rent (3 days): " + car.calculateRent(3));
	        
	        Customer c3 = new Customer(3,"Himanshu");
	        System.out.println("---------------------------");
	        c3.displayCustomer();
	        System.out.println("Truck Rent (3 days): " + truck.calculateRent(3));

	}

}
