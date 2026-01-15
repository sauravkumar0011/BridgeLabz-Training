package com.smartself;

public class SmartShelf {

	static void sortByTitle(Book[] books) {
        for (int i = 1; i < books.length; i++) {
            Book current = books[i];
            int j = i - 1;

            while (j >= 0 && books[j].title.compareToIgnoreCase(current.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = current;
        }
    }
	
	public static void main(String[] args) {

		 Book[] shelf = {
		            new Book("Data Structures"),
		            new Book("Algorithms"),
		            new Book("Computer Networks"),
		            new Book("Operating Systems"),
		            new Book("Artificial Intelligence")
		        };

		        sortByTitle(shelf);

		        for (Book b : shelf) {
		            b.show();
		        }

	}

}
