package com.constructor.levelone;
import java.util.*;

public class Book {

	public String bookName;
	public String authorName;
	public int price;
	
	public Book() {
		this.bookName ="Revolution 2020";
		this.authorName = "Chetan Bhagat";
		this.price = 200;
	}
	
	public Book(String title, String author, int price) {
		this.bookName = title;
		this.authorName =author;
		this.price = price;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter book name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter author name: ");
		String author = sc.nextLine();
		
		System.out.print("Enter price: ");
		int price = sc.nextInt();
		
		Book b= new Book(name, author, price);
		
		System.out.println("Book name: "+b.bookName+", author name "+b.authorName+", price of book: "+b.price);
		
		sc.close();
	}
}


