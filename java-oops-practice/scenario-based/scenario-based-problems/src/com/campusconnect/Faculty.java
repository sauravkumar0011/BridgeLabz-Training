package com.campusconnect;

public class Faculty extends Person{
	
	public Faculty( int id, String name, String email) {
	super(name, email, id);
	}
	
	@Override
	public void showDetails()
	{
		System.out.println("Faculty id:" + id);
		System.out.println("Faculty name:" + name);
		System.out.println("Faculty email:" + email);
	}
}
