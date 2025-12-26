package com.classandobject.levelone;

public class HandleBookDetails {
    
		String bookTitle;
		String bookAuthor;
		double price;
		
		HandleBookDetails(String bookTitle, String bookAuthor, double price){
			this.bookTitle=bookTitle;
			this.bookAuthor=bookAuthor;
			this.price=price;
		}
		
		//Method to display the results
		public void displayBookDetails() {
			System.out.println("Title of the book: "+bookTitle);
			System.out.println("Author of the book: "+bookAuthor);
			System.out.println("Price of the book: "+price);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandleBookDetails book1 = new HandleBookDetails("Rich Dad Poor Dad", "Robert Kiyosaki", 575.00);
		HandleBookDetails book2 = new HandleBookDetails("Wings of fire", "Abdul kalam.A.P.J", 600.00);
		book1.displayBookDetails();
		book2.displayBookDetails();
	}

}
