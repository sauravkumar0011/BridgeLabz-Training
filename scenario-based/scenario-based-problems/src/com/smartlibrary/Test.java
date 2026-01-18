package com.smartlibrary;

public class Test {

	 public static void main(String[] args) {

	        BorrowedBookList list = new BorrowedBookList();

	        list.addBook(new Book("Operating Systems"));
	        list.addBook(new Book("Data Structures"));
	        list.addBook(new Book("Computer Networks"));
	        list.addBook(new Book("Algorithms"));
	        list.addBook(new Book("Database Systems"));

	        list.displayBooks();
	 }
}
