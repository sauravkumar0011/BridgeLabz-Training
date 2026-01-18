package com.smartlibrary;

import java.util.ArrayList;
import java.util.List;

public class BorrowedBookList {

	private List<Book> books = new ArrayList<>();
	
	public void addBook(Book newBook) {
		int i = books.size() - 1;
		
		books.add(null);
		
		while(i>=0 && books.get(i).getTitle().compareToIgnoreCase(newBook.getTitle())>0)
		{
			books.set(i+1, books.get(i));
			i--;
		}
		
		books.set(i+1, newBook);
	}
	
	public void displayBooks() {
		for(Book b : books) {
			System.out.println(b.getTitle());
		}
	}
}
