package com.bookshelf;

import java.util.*;

public class BookShelf {

    static HashMap<String,LinkedList<String>> books = new HashMap<>();
    static HashSet<String> addedBooks = new HashSet<>();
	
    public static void addBook(String genre, String author, String bookName) {
    	
    	String book = bookName + " by " + author;
    	
    	if(addedBooks.contains(book))
    	{
    		System.out.println("Book already Exists");
    		return;
    	}
    	
    	books.putIfAbsent(genre, new LinkedList<>());
    	books.get(genre).add(book);
    	addedBooks.add(book);
    }
    
    public static void borrowBook(String genre, String author, String bookName) {
    	
    	String book = bookName + " by " + author;
    	
    	  if (!books.containsKey(genre) || !books.get(genre).remove(book)) {
              System.out.println("Book not available");
              return;
          }

          addedBooks.remove(book);
          System.out.println("Book borrowed");
    	
    }
    
    static void showBooks() {
        for (String genre : books.keySet()) {
            System.out.println(genre + " : " + books.get(genre));
        }
    }
 
	public static void main(String[] args) {

		//Add books
	    addBook("Fiction", "Harry Potter", "J.K. Rowling");
	    addBook("Fiction", "The Hobbit", "Tolkien");
	    addBook("Science", "A Brief History of Time", "Stephen Hawking");

	    addBook("Fiction", "Harry Potter", "J.K. Rowling");

	    System.out.println("\n--- Books After Adding ---");
	    showBooks();


	    borrowBook("Fiction", "Harry Potter", "J.K. Rowling");


	    borrowBook("Fiction", "Harry Potter", "J.K. Rowling");


	    borrowBook("History", "World War II", "Author X");

	    System.out.println("\n--- Books After Borrowing ---");
	    showBooks();
	}

}
