package com.objectmodelling.levelone;

public class Book {
	
	public String title = "";
	public String author = "";
	
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	
	public void displayBook()
	{
		 System.out.println(title + " by " + author);
	}
}
