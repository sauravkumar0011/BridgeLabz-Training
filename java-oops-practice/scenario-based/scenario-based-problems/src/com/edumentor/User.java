package com.edumentor;

public class User {

	protected String name;
	protected String email;
	protected int id;
	
	public User(String name, String email, int id)
	{
		this.name = name;
		this.email = email;
		this.id = id;
	}
	public String getName()
	{return name;}
	
}
