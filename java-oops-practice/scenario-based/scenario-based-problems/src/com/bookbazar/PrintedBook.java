package com.bookbazar;

public class PrintedBook extends Book {

	public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    public double applyDiscount(int quantity) {
        if (quantity >= 3)
            return (price * quantity) - 100;
        return price * quantity;
    }
}
