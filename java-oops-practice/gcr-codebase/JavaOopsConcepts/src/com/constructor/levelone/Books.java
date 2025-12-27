package com.constructor.levelone;

public class Books {

	public long ISBN;
	protected String title;
	private String author;
	
	Books(long isbn, String title, String author){
		this.ISBN = isbn;
		this.title = title;
		this.author = author;
	}
	public void setName(String name) {
		this.author = name;
	}
	public void getName() {
		System.out.print("Author name: "+this.author);
	}
}
