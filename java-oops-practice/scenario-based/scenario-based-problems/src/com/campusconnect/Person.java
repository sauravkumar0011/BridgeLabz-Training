package com.campusconnect;

public class Person {

	protected String name;
	protected String email;
	protected int id;
	
	public Person(String name, String email, int id) {
		this.name  =name ;
		this.email = email;
		this.id = id;
	}
	
	public void showDetails()
	{
		System.out.println("Show details of person");
	}
}
